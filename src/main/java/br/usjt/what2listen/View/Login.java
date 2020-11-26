package br.usjt.what2listen.View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login {
    public static JPanel loginView(){
        JPanel jp = new JPanel();
        JPanel left = new JPanel();
        left.setBackground(Color.CYAN);
        left.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel labelUserCad = new JLabel("Username cad:");
        JTextField labelUserCadF = new JTextField();
        JLabel labelMailCad = new JLabel("Email cad:");
        JTextField labelMailCadF = new JTextField();
        JLabel labelPasswordCad = new JLabel("Password cad:");
        JTextField labelPasswordCadF = new JTextField();
        JButton btnCad = new JButton("Cadastrar");

        left.add(labelUserCad);
        left.add(labelUserCadF);
        left.add(labelMailCad);
        left.add(labelMailCadF);
        left.add(labelPasswordCad);
        left.add(labelPasswordCadF);
        left.add(btnCad);
        left.setLayout(new GridLayout(7, 1));


        JPanel right = new JPanel();
        right.setBorder(new EmptyBorder(10, 10, 10, 10));
        right.setBackground(Color.GREEN);

        JLabel labelUser = new JLabel("Username:");
        JLabel labelPassword = new JLabel("Password :");
        JLabel labelEmpty = new JLabel("");
        JButton btnlog= new JButton("Logar");

        right.add(labelUser);
        right.add(labelPassword);
        right.add(labelEmpty);
        right.add(btnlog);
        right.setLayout(new GridLayout(4, 1));


        jp.add(left);
        jp.add(right);
        jp.setLayout(new GridLayout(1, 2));


        return jp;
    }
}
