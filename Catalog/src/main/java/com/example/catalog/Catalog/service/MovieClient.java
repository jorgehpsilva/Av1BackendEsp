package com.example.catalog.Catalog.service;

import com.example.catalog.Catalog.model.Movie;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("MOVIE-SERVICE")
@LoadBalancerClient(value = "MOVIE-SERVICE")

public interface MovieClient {

    @GetMapping("/movie/{genre}")
    List<Movie> getByGenre(@PathVariable("genre") String genre);

    @GetMapping("/movies")
    List<Movie> getAll();

}
