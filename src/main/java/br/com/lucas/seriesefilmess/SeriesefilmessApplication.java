package br.com.lucas.seriesefilmess;

import br.com.lucas.seriesefilmess.principal.Principal;
import br.com.lucas.seriesefilmess.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeriesefilmessApplication implements CommandLineRunner {

	@Autowired
	private SerieRepository repositorio ;


	public static void main(String[] args) {

		SpringApplication.run(SeriesefilmessApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();


	}
}
