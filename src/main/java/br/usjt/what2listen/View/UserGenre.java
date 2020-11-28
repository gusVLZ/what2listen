package br.usjt.what2listen.View;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class UserGenre {

    public static JPanel view() {


        
        JPanel wrap = new JPanel();
        wrap.setBackground(Color.LIGHT_GRAY);
        wrap.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;
        gbc.insets = new Insets(15,15,15,15);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridwidth=1;
        gbc.gridheight=1;

        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=2;
        wrap.add(Components.title("Gêneros Favoritos", Font.BOLD, 18), gbc);
        gbc.gridwidth=1;
        
        gbc.gridx=0;
        gbc.gridy=1;
        wrap.add(Components.title("Gêneros Favoritos", Font.PLAIN, 16), gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        wrap.add(Components.title("Outros Gêneros", Font.PLAIN, 16), gbc);

        gbc.gridx=0;
        gbc.gridy=2;
        gbc.weighty=6;
        JPanel leftInner = new JPanel();
        leftInner.setBorder(new EmptyBorder(20, 20, 20, 20));
        for (int i = 0; i < 50; i++) {
            leftInner.add(new JLabel("Teste:" + i));
        }
        leftInner.setLayout(new GridLayout(50, 1));
        wrap.add(new JScrollPane(leftInner), gbc);

        

        gbc.gridx=1;
        gbc.gridy=2;
        gbc.weighty=6;
        JPanel rightInner = new JPanel();
        rightInner.setBorder(new EmptyBorder(20, 20, 20, 20));
        for (int i = 0; i < 50; i++) {
            rightInner.add(new JLabel("Teste:" + i));
        }
        rightInner.setLayout(new GridLayout(50, 1));
        wrap.add(new JScrollPane(rightInner), gbc);




        /**JPanel jp = new JPanel();
        JPanel left = new JPanel();
        left.setBorder(new EmptyBorder(60, 60, 60, 60));
        left.setBackground(Color.lightGray);

        

        left.setLayout(new GridLayout(2, 1));
        JScrollPane leftScroll = new JScrollPane(leftInner);

        left.add(new JLabel("teste"));
        left.add(leftScroll);

        JPanel right = new JPanel();
        right.setBorder(new EmptyBorder(60, 60, 60, 60));
        JLabel tituloLogin = new JLabel("Login");
        tituloLogin.setFont(new Font("Arial", Font.BOLD, 16));
        right.setLayout(new GridLayout(9, 1));

        JPanel rightInner = new JPanel();
        leftInner.setBorder(new EmptyBorder(20, 20, 20, 20));

        jp.add(left);
        jp.add(right);
        jp.setLayout(new GridLayout(1, 2));*/

        return wrap;
    }


}
