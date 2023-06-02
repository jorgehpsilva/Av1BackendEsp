package com.example.movie.Movie.repository;


import com.example.movie.Movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Integer> {

    @Query("SELECT m FROM MovieEntity m WHERE m.genre = :genre")
    List<MovieEntity> findByGenre(@PathVariable("genre") String genre);
}
