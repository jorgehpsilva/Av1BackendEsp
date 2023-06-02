package com.example.catalog.Catalog.resource;


import com.example.catalog.Catalog.model.Catalog;
import com.example.catalog.Catalog.model.Movie;
import com.example.catalog.Catalog.service.MovieClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private MovieClient movieClient;

    @GetMapping("/movies/{genre}")
    public ResponseEntity<Catalog> getCatalogByGenre(@PathVariable String genre) {
        List<Movie> movies = movieClient.getByGenre(genre);
        System.out.println("Filmes que estão aqui: " + movies.size());
        Catalog catalog = new Catalog();
        catalog.setGenre(genre);
        catalog.setMovies(movies);
        return ResponseEntity.ok((catalog));
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAll() {
        List<Movie> movies = movieClient.getAll();
        System.out.println("Total de filmes encontrados: " + movies.size());
        return ResponseEntity.ok(movies);
    }
}
