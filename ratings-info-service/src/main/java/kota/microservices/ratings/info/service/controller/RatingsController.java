package kota.microservices.ratings.info.service.controller;

import kota.microservices.ratings.info.service.dto.RatingDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class RatingsController {

    @GetMapping(path = "/getMovieRating/{movieName}")
    public RatingDto getMovieRating(@PathVariable String movieName) {

       return movieRatingByMovie(movieName);
    }

    private RatingDto movieRatingByMovie(String movieName) {
        Map<String, Integer> ratings = new HashMap<>();
        ratings.put("Khaidi",4);
        ratings.put("Arjun reddy",5);
        ratings.put("Sye ra",4);

        return new RatingDto(ratings.get(movieName));
    }


}

