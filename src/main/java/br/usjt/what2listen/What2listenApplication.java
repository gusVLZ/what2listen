package br.usjt.what2listen;

import br.usjt.what2listen.Utils.GetFiles;
import br.usjt.what2listen.View.MainFrame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class What2listenApplication {


	public static void main(String[] args) {
		
		JFrame loading;
		loading = new JFrame();
		loading.setLocationRelativeTo(null);
		
        loading.setIconImage(GetFiles.getImage("imgs/SEM_FUNDO.png"));
		JPanel panel = new JPanel();

		panel.add(new JLabel(new ImageIcon(GetFiles.getImage("imgs/W2L_CARREGANDO_AZUL.jpg").getScaledInstance(200, 200, Image.SCALE_SMOOTH))));
		loading.setContentPane(panel);
		loading.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loading.pack();
		loading.setLocationRelativeTo(null);
		loading.setVisible(true);
		

		SpringApplicationBuilder builder = new SpringApplicationBuilder(What2listenApplication.class);
		builder.headless(false);
		builder.run(args);

        SwingUtilities.invokeLater(() -> {
			loading.setVisible(false);
			loading.dispose();
            new MainFrame();
        });
	}

}
