package br.com.lucas.seriesefilmess;

import br.com.lucas.seriesefilmess.model.DadosSerie;
import br.com.lucas.seriesefilmess.service.ConsumoApi;
import br.com.lucas.seriesefilmess.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeriesefilmessApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SeriesefilmessApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=breaking+bad&apikey=341121df");
//		System.out.println(json);
//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
