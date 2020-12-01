package br.usjt.what2listen.View;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;

import br.usjt.what2listen.Utils.GetFiles;

public class Menu {
	public static JPanel menuView() {

		MainFrame.jf.setTitle("Dashboard - What2Listen");

		JPanel jp = new JPanel();
		jp.setBorder(new EmptyBorder(60, 60, 60, 60));
		//jp.setBackground(Color.lightGray);
		jp.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		JButton btnGenre = new JButton("Gêneros Favoritos");
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
				Recomendacoes rec = new Recomendacoes();
				MainFrame.jf.setContentPane(rec.RecView());
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


		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(15, 15, 15, 15);

		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth=2;

		JLabel picLabel = new JLabel(
			new ImageIcon(
				GetFiles.getImage("imgs/W2LNBG.png").getScaledInstance(300, 214, Image.SCALE_SMOOTH)
			)
		);
		jp.add(picLabel, gbc);
		gbc.gridwidth=1;

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 3.0;
		jp.add(btnGenre, gbc);

		gbc.gridx = 1;
		jp.add(btnRec, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weighty = 1.0;
		gbc.gridwidth=2;
		jp.add(btnLogout, gbc);

		return jp;
	}

}
