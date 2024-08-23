package br.com.lucas.seriesefilmess.repository;

import br.com.lucas.seriesefilmess.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
