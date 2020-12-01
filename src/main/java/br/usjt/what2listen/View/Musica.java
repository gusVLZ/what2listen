package br.usjt.what2listen.View;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.what2listen.Controller.SongController;
import br.usjt.what2listen.Controller.SongGenreController;
import br.usjt.what2listen.Controller.SongRateController;
import br.usjt.what2listen.Model.Genre;
import br.usjt.what2listen.Model.Song;
import br.usjt.what2listen.Model.SongRate;
import br.usjt.what2listen.Utils.BeanProvider;
import br.usjt.what2listen.Utils.GetFiles;
import br.usjt.what2listen.Utils.Globals;

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

		centerPanel.add(Components.title("Artista: " + s.getArtist(), Font.PLAIN, 22), gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		// centerPanel.add(Components.title("Gêneros: ", Font.PLAIN, 24), gbc);
		String gen = "";
		for (Genre genre : sg) {
			gen += genre.getName() + ", ";
		}
		gen = gen.substring(0, gen.length() - 2);
		centerPanel.add(Components.title("Gêneros: " + gen, Font.PLAIN, 22), gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		rate = rate == null ? "Não avaliado" : rate;
		centerPanel.add(Components.title("Média de Avaliações: " + rate, Font.PLAIN, 22), gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		centerPanel.add(Components.title("Clique para avaliar", Font.PLAIN, 18), gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		JPanel avaPanel = new JPanel();
		for (int i = 1; i < 6; i++) {

			AvaButtonAction aba = new AvaButtonAction();
			avaPanel.add(aba.avaButton(i, s.getId()));
		}
		avaPanel.setLayout(new GridLayout(1, 5, 10, 10));

		centerPanel.add(avaPanel, gbc);

		// Adding Components to the frame.
		frame.add(BorderLayout.SOUTH, southPanel);
		frame.add(BorderLayout.NORTH, northPanel);
		frame.add(BorderLayout.CENTER, centerPanel);

		return frame;
	}

	class AvaButtonAction implements ActionListener {
		private int rate = 0;
		private int idSong = 0;

		public JButton avaButton(int rate2, int idSong2) {
			rate = rate2;
			idSong = idSong2;
			JButton btn = new JButton(new ImageIcon(GetFiles.getImage("imgs/musical-notes.png")
					.getScaledInstance(30 + (rate * 7), 30 + (rate * 7), Image.SCALE_SMOOTH)));
			btn.addActionListener(this);
			return btn;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			SongRate sr = new SongRate(Globals.usuarioLogado.getId(), idSong, rate);

			try {
				SongRate srr = src.addSongRate(sr);

				if (srr != null && srr.getId() > 0) {
					JOptionPane.showMessageDialog(null, "Avaliação registrada!");
					Recomendacoes rec = new Recomendacoes();
					MainFrame.jf.setContentPane(rec.RecView());
					MainFrame.jf.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Não foi possível realizar a avaliação.");
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Não foi possível realizar a avaliação.");
			}
		}
	}

}
