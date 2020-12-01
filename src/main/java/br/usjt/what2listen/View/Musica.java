package br.usjt.what2listen.View;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.what2listen.Controller.SongController;
import br.usjt.what2listen.Controller.SongGenreController;
import br.usjt.what2listen.Controller.SongRateController;
import br.usjt.what2listen.Model.Genre;
import br.usjt.what2listen.Model.Song;
import br.usjt.what2listen.Utils.BeanProvider;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class Musica {

	@Autowired
	private SongRateController src;
	@Autowired
	private SongController sc;
	@Autowired
	private SongGenreController sgc;

	public Musica() {
		MainFrame.jf.setTitle("Recomendações - What2Listen");
		BeanProvider.autowire(this);
	}

	public JPanel MusicaView(int idSong) {

		// Creating the Frame
		JPanel frame = new JPanel();
		frame.setLayout(new BorderLayout());
		// North panel
		JPanel northPanel = new JPanel(); // the panel is not visible in output
		northPanel.setBackground(Color.LIGHT_GRAY);
		Song s = sc.getSong(idSong);
		String rate = src.getRateByIdSong(idSong);
		List<Genre> sg = sgc.getGenreByIdSong(idSong);
		northPanel.add(Components.title(s.getName(), Font.PLAIN, 24));

		// Creating the panel at bottom and adding components
		JPanel southPanel = new JPanel(); // the panel is not visible in output
		southPanel.setBackground(Color.lightGray);
		JButton btnMenu = new JButton("Voltar para recomendações");
		btnMenu.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Recomendacoes rec = new Recomendacoes();
				MainFrame.jf.setContentPane(rec.RecView());
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

		centerPanel.add(Components.title("Artista: " + s.getArtist(), Font.PLAIN, 24), gbc);		

        gbc.gridx = 0;
        gbc.gridy = 1;
		//centerPanel.add(Components.title("Gêneros: ", Font.PLAIN, 24), gbc);
		String gen = "";
		for (Genre genre : sg) { 
			gen += genre.getName() + ", ";
			 }
		gen = gen.substring(0, gen.length()-2);
		centerPanel.add(Components.title("Gêneros: " + gen, Font.PLAIN, 24), gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		rate = rate == null ? "Não avaliado" : rate;
		centerPanel.add(Components.title("Média de Avaliações: " + rate , Font.PLAIN, 24), gbc);		

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weighty=6;
		centerPanel.add(Components.title("A avaliação vai aqui" , Font.PLAIN, 24), gbc);	

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
