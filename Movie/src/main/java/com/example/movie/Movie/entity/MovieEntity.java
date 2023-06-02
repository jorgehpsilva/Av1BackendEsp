package com.example.movie.Movie.entity;


import com.example.movie.Movie.entity.dto.MovieDTO;

import javax.persistence.*;

@Entity
@Table(name="MovieEntity")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@Column (name="id", nullable = false)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private String urlStream;

    public MovieEntity() {
    }


    public MovieEntity(int id, String name, String genre, String urlStream) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.urlStream = urlStream;
    }

    public MovieEntity(MovieDTO movieDTO){
        this.id = movieDTO.getId();
        this.name = movieDTO.getName();
        this.genre = movieDTO.getGenre();
        this.urlStream = movieDTO.getUrlStream();
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
