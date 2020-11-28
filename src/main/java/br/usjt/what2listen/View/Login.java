package br.usjt.what2listen.View;


import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Login {
	public static JPanel loginView() {
		JPanel jp = new JPanel();
		JPanel left = new JPanel();
		left.setBorder(new EmptyBorder(60, 60, 60, 60));
		left.setBackground(Color.lightGray);
		JLabel tituloCadastro = new JLabel("Cadastro");
		tituloCadastro.setFont(new Font("Arial", Font.BOLD, 16));
		JLabel labelUserCad = new JLabel("Username cad:");
		JTextField labelUserCadF = new JTextField();
		JLabel labelMailCad = new JLabel("Email cad:");
		JTextField labelMailCadF = new JTextField();
		JLabel labelPasswordCad = new JLabel("Password cad:");
		JTextField labelPasswordCadF = new JTextField();
		JLabel labelEmpty1 = new JLabel("");
		JButton btnCad = new JButton("Cadastrar");

		left.add(tituloCadastro);
		left.add(labelUserCad);
		left.add(labelUserCadF);
		left.add(labelMailCad);
		left.add(labelMailCadF);
		left.add(labelPasswordCad);
		left.add(labelPasswordCadF);
		left.add(labelEmpty1);
		left.add(btnCad);
		left.setLayout(new GridLayout(9, 1));

		JPanel right = new JPanel();
		right.setBorder(new EmptyBorder(60, 60, 60, 60));
		JLabel tituloLogin = new JLabel ("Login");
		tituloLogin.setFont(new Font("Arial", Font.BOLD, 16));
		JLabel labelUser = new JLabel("Username:");
		JTextField labelUserL = new JTextField();
		JLabel labelPassword = new JLabel("Password :");
		JTextField labelPasswordL = new JTextField();
		JLabel labelEmpty = new JLabel("");
		JButton btnlog = new JButton("Logar");	

		btnlog.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame jf = new JFrame("Dashboard");
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.setSize(800, 600);
                jf.setLocationRelativeTo(null);

                jf.setContentPane(Menu.menuView());

                jf.setVisible(true);
			}
		});
		

		right.add(tituloLogin);
		right.add(labelUser);
		right.add(labelUserL);
		right.add(labelPassword);
		right.add(labelPasswordL);
		right.add(labelEmpty);
		right.add(btnlog);
		right.setLayout(new GridLayout(9, 1));

		jp.add(left);
		jp.add(right);
		jp.setLayout(new GridLayout(1, 2));


		return jp;
	}
}
