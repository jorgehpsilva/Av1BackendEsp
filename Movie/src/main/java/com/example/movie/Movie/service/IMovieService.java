package com.example.movie.Movie.service;

import java.util.List;

public interface IMovieService<T> {

    List<T> getAll();

    T create(T t);

    List<T> getByGenre(String genre);
}
