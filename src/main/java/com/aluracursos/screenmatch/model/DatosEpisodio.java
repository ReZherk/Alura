package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosEpisodio(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Episode") Integer numeroEpisodio,
        @JsonAlias("imdbRating") String evaluacion,
        @JsonAlias("Released") String fechaDeLanzamiento
) {
    @Override
    public String toString() {
        return "Título: " + titulo +
                " Número de episodio: " + numeroEpisodio +
                " Evaluación: " + evaluacion +
                " Fecha de lanzamiento: " + fechaDeLanzamiento;
    }
}
