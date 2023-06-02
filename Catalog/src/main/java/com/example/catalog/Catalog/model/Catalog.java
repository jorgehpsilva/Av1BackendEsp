package com.example.catalog.Catalog.model;

import java.util.List;

public class Catalog {

    private String genre;

    private List<Movie> movies;

    public Catalog(){

    }

    public Catalog(String genre, List<Movie> movies) {
        this.genre = genre;
        this.movies = movies;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
