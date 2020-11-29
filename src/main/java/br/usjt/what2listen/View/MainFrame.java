package br.usjt.what2listen.View;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

    /**
     *
     */
    public static JFrame jf;
    
    private static final long serialVersionUID = 1L;

    //public static void main() {

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public MainFrame(){
        jf = new JFrame("What 2 Listen - EngComp");
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        Login login = new Login();
        jf.setContentPane(login.loginView());

        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setVisible(true);

        //initComponents();
        //setColor(btn_1); 
        /*ind_1.setOpaque(true);
        resetColor(new JPPnel[]{btn_2,btn_3,btn_4}, new JPanel[]{ind_2,ind_3, ind_4});
        jProgressBar1.setValue(50);*/

    }

}
