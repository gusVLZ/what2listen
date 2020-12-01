package br.usjt.what2listen.View;

import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;

public class MainFrame extends JFrame {

    public static JFrame jf;

    private static final long serialVersionUID = 1L;

    public MainFrame() {
        jf = new JFrame("What 2 Listen - EngComp");
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        Login login = new Login();
        jf.setContentPane(login.loginView());

        java.net.URL url = ClassLoader.getSystemResource("br/usjt/what2listen/Lib/SEM_FUNDO.png/");

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        jf.setIconImage(img);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

}
