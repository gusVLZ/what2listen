package br.usjt.what2listen.View;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableCellEditor;
import javax.swing.text.TableView.TableCell; 

public class Musica {
	public static JPanel MusicaView() {

		// Creating the Frame
		JPanel frame = new JPanel();
		frame.setLayout(new BorderLayout());
		// North panel
		JPanel northPanel = new JPanel(); // the panel is not visible in output
		northPanel.setBackground(Color.LIGHT_GRAY);
		northPanel.add(Components.title("Aqui vai o título da música", Font.PLAIN, 24));

		// Creating the panel at bottom and adding components
		JPanel southPanel = new JPanel(); // the panel is not visible in output
		southPanel.setBackground(Color.lightGray);
		JButton btnMenu = new JButton("Voltar para recomendações");
		btnMenu.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.jf.setContentPane(Recomendacoes.RecView());
				MainFrame.jf.setVisible(true);
			}
		});
		southPanel.add(btnMenu);

		// Text Area at the Center
		// JTextArea ta = new JTextArea();
		JPanel centerPanel = new JPanel(); // the panel is not visible in output
		centerPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(15, 15, 15, 15);

		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;

		gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel album = new JLabel("album");
		centerPanel.add(album);

		gbc.gridx = 1;
        gbc.gridy = 0;
        JLabel genero = new JLabel("Psedo Pag");
        centerPanel.add(genero);


        gbc.gridx = 2;
        gbc.gridy = 0;
        JLabel rate = new JLabel("Media");
        centerPanel.add(rate);

		//ImageIcon icon = new ImageIcon(getClass().getResource("penguin.png")); só da pra colocar se a classe não for estatica
        
        //JLabel label = new JLabel("aqui vai o penguin");


		//centerPanel.add(label);

		//centerPanel.add(Components.title("Aqui vai uma imagem", Font.PLAIN, 16), gbc);

		/*
		 * DefaultListModel model = new DefaultListModel(); JList list = new
		 * JList(model);
		 * 
		 * // Initialize the list with items String[] items = { "A", "B", "C", "D" };
		 * for (int i = 0; i < items.length; i++) { model.add(i, items[i]);
		 * 
		 * }
		 * 
		 * centerPanel.add(list);
		 */
		// Initialize the list with items
		/*
		String[] items = { "A", "B", "C", "D" };
		for (int i = 0; i < items.length; i++) {
			model.add(i, items[i]);
		}
		centerPanel.add(list);*/

		// Adding Components to the frame.
		frame.add(BorderLayout.SOUTH, southPanel);
		frame.add(BorderLayout.NORTH, northPanel);
		frame.add(BorderLayout.CENTER, centerPanel);

		return frame;
	}

}
