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
		JButton btnGenre = new JButton("Generos Favoritos");
		JLabel labelEmpty = new JLabel("");
		JButton btnRec = new JButton("Recomendações");

		btnGenre.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				UserGenre ug = new UserGenre();
				MainFrame.jf.setContentPane(ug.view());

				MainFrame.jf.setVisible(true);
			}
		});
		
		btnRec.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{				
				
					MainFrame.jf.setContentPane(Recomendacoes.RecView());


                MainFrame.jf.setVisible(true);
			}
		});

		jp.add(btnGenre);	
		jp.add(labelEmpty);	
		jp.add(btnRec);
		jp.setLayout(new GridLayout(9, 1));


		return jp;
	}
	
}
