package br.usjt.what2listen.View;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

    public static JFrame jf;
    
    private static final long serialVersionUID = 1L;
    
    public MainFrame(){
        jf = new JFrame("What 2 Listen - EngComp");
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        Login login = new Login();
        jf.setContentPane(login.loginView());

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

}
