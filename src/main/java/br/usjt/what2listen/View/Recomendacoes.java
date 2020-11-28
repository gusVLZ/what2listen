package br.usjt.what2listen.View;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class Recomendacoes  {
	public static JFrame RecView() {

		//Creating the Frame
        JFrame frame = new JFrame("Recomendações");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);

        //Creating the MenuBar and adding components
		JButton mb = new JButton("Menu");
		
        mb.addActionListener((ActionListener) new ActionListener(){
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
 
        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
		panel.setBackground(Color.lightGray);


        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);

		return frame;
	}
	
}
