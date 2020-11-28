package br.usjt.what2listen.View;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Recomendacoes  {
	public static JPanel RecView() {

		JPanel jp = new JPanel();
		jp.setBorder(new EmptyBorder(200, 60, 0, 60));
		jp.setBackground(Color.lightGray);
		JButton btnBack = new JButton("Menu");
		JLabel labelEmpty = new JLabel("");
		
		btnBack.addActionListener((ActionListener) new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JFrame jf = new JFrame("Menu");
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.setSize(800, 600);
                jf.setLocationRelativeTo(null);

                jf.setContentPane(Menu.menuView());

                jf.setVisible(true);
			}
		});

		jp.add(btnBack);	
		jp.add(labelEmpty);	
		jp.setLayout(new GridLayout(9, 1));


		return jp;
	}
	
}
