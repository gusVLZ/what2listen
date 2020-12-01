package br.usjt.what2listen;

import br.usjt.what2listen.Utils.Globals;
import br.usjt.what2listen.Model.UserTable;
import br.usjt.what2listen.View.MainFrame;

import javax.swing.SwingUtilities;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class What2listenApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(What2listenApplication.class);
		Globals.usuarioLogado = new UserTable(1, "gusVLZ", "gvnv.2000@gmail.com", "123456");
		builder.headless(false);
		builder.run(args);

        SwingUtilities.invokeLater(() -> {
            new MainFrame();
        });
	}

}
