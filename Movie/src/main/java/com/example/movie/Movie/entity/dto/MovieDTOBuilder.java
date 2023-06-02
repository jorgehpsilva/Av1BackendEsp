package com.example.movie.Movie.entity.dto;

import com.example.movie.Movie.entity.MovieEntity;

public class MovieDTOBuilder {
    private int id;
    private String name;
    private String genre;
    private String urlStream;
    private MovieEntity movieEntity;
    private MovieEntity movie;

    public MovieDTOBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public MovieDTOBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MovieDTOBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public MovieDTOBuilder setUrlStream(String urlStream) {
        this.urlStream = urlStream;
        return this;
    }

    public MovieDTOBuilder setMovieEntity(MovieEntity movieEntity) {
        this.movieEntity = movieEntity;
        return this;
    }

    public MovieDTOBuilder setMovie(MovieEntity movie) {
        this.movie = movie;
        return this;
    }

    public MovieDTO createMovieDTO() {
        return new MovieDTO(id, name, genre, urlStream);
    }
}