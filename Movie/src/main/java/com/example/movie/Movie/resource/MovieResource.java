package com.example.movie.Movie.resource;

import com.example.movie.Movie.entity.dto.MovieDTO;
import com.example.movie.Movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieResource {


    @Autowired
    private IMovieService movieService;


    @GetMapping("/movies/{genre}")
    public List<MovieDTO> getByGenre(@PathVariable String genre){
        return movieService.getByGenre(genre);
    }

    @GetMapping("/movies")
    public List<MovieDTO> getAll() {
        return movieService.getAll();
    }
}
