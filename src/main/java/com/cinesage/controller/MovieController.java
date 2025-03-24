package com.cinesage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cinesage.model.Movie;
import com.cinesage.service.MovieService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/save")
    public String addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @GetMapping("/search")
    public List<Movie> searchMovies(@RequestParam String searchString) {
        return movieService.searchMovies(searchString);
    }

}
