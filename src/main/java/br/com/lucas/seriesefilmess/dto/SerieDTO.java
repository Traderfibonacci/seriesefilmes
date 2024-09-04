package br.com.lucas.seriesefilmess.dto;

import br.com.lucas.seriesefilmess.model.Categoria;


public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Double avaliacao,
                       Categoria genero,
                       String atores,
                       String poster,
                       String sinopse) {
}
