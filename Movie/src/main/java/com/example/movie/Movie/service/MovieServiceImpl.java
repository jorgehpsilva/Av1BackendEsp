package com.example.movie.Movie.service;

import com.example.movie.Movie.entity.MovieEntity;
import com.example.movie.Movie.entity.dto.MovieDTO;
import com.example.movie.Movie.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService<MovieDTO> {

    @Autowired
    private IMovieRepository iMovieRepository;

    @Override
    public MovieDTO create(MovieDTO movieDTO) {
        MovieEntity movieEntity = new MovieEntity(movieDTO);
        movieEntity = iMovieRepository.save(movieEntity);
        movieDTO = new MovieDTO(movieEntity);
        return movieDTO;
    }
    @Override
    public List<MovieDTO> getAll() {
        List<MovieEntity> movieEntities = iMovieRepository.findAll();
        List<MovieDTO> movieDTOS = new ArrayList<>();
        for (MovieEntity movie : movieEntities) {
            MovieDTO movieDTO = new MovieDTO(movie);
            movieDTOS.add(movieDTO);
        }
        return movieDTOS;
    }
    @Override
    public List<MovieDTO> getByGenre(String genre){
        List<MovieEntity> movies = iMovieRepository.findByGenre(genre);
        System.out.println("Filmes encontrados no H2: " + movies.size());
        List<MovieDTO> movieDTO = new ArrayList<>();
        for(MovieEntity movie : movies)
            movieDTO.add(new MovieDTO(movie));

        return movieDTO;
    }
}
