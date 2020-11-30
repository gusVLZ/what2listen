package br.usjt.what2listen.View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;

public class Menu {
	public static JPanel menuView() {

		JPanel jp = new JPanel();
		jp.setBorder(new EmptyBorder(200, 60, 0, 60));
		jp.setBackground(Color.lightGray);
		JButton btnGenre = new JButton("Gêneros Favoritos");
		JLabel labelEmpty = new JLabel("");
		JLabel labelEmpty1 = new JLabel("");
		JLabel labelEmpty2 = new JLabel("");
		JButton btnRec = new JButton("Recomendações");
		JButton btnLogout = new JButton("Logout");

		btnGenre.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserGenre ug = new UserGenre();
				MainFrame.jf.setContentPane(ug.view());
				MainFrame.jf.setVisible(true);
			}
		});

		btnRec.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.jf.setContentPane(Recomendacoes.RecView());
				MainFrame.jf.setVisible(true);
			}
		});

		btnLogout.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				MainFrame.jf.setContentPane(l.loginView());

				MainFrame.jf.setVisible(true);
			}
		});

		jp.add(btnGenre);
		jp.add(labelEmpty);
		jp.add(btnRec);
		jp.add(labelEmpty1);
		jp.add(labelEmpty2);
		jp.add(btnLogout);
		jp.setLayout(new GridLayout(11, 1));

		return jp;
	}

}
