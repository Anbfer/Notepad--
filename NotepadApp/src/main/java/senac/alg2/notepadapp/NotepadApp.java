/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package senac.alg2.notepadapp;

import senac.alg2.notepadapp.ui.Notepad;

/**
 *
 * @author Angelo
 */
public class NotepadApp {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        new Notepad().setVisible(true);
    }
}
