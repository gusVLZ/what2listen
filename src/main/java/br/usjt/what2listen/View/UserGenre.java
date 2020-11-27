package br.usjt.what2listen.View;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class UserGenre {

    public static JPanel view() {

        JPanel jp = new JPanel();
        JPanel left = new JPanel();
        left.setBorder(new EmptyBorder(60, 60, 60, 60));
        left.setBackground(Color.lightGray);

        JPanel leftInner = new JPanel();
        leftInner.setBorder(new EmptyBorder(20, 20, 20, 20));
        left.setBackground(Color.white);

        for (int i = 0; i < 50; i++) {
            leftInner.add(new JLabel("Teste:" + i));
        }

        leftInner.setLayout(new GridLayout(50, 1));

        left.setLayout(new GridLayout(1, 1));
        JScrollPane leftScroll = new JScrollPane(leftInner);
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
        jp.setLayout(new GridLayout(1, 2));

        return jp;
    }

}
