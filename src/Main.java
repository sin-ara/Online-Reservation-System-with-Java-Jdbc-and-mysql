/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JAVAproject;

/**
 *
 * @author User1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
				
				
            }
        });
        // TODO code application logic here
    }

}
