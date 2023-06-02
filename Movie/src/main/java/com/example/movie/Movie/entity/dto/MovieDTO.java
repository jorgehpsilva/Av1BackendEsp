package com.example.movie.Movie.entity.dto;


import com.example.movie.Movie.entity.MovieEntity;

public class MovieDTO {

    private int id;
    private String name;
    private String genre;
    private String urlStream;

    public MovieDTO(int id, String name, String genre, String urlStream) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.urlStream = urlStream;
    }

    public MovieDTO(MovieEntity movieEntity) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrlStream() {
        return urlStream;
    }

    public void setUrlStream(String urlStream) {
        this.urlStream = urlStream;
    }
}
