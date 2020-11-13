package br.usjt.what2listen;
 
import br.usjt.what2listen.View.MainFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class What2listenApplication {

	public static void main(String[] args) {
		new MainFrame();
		SpringApplication.run(What2listenApplication.class, args);
	}

}
