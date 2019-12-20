package kota.microservices.movie.info.service.controller;

import kota.microservices.movie.info.service.dto.MovieDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MovieController {

    @GetMapping(path = "/getMovies")
    public List<MovieDto> getMoviesDetails() {

        return Arrays.asList(new MovieDto("Khaidi","telugu","10/Feb/2019")
                            ,new MovieDto("Arjun reddy","telugu","01/Mar/2019")
                            ,new MovieDto("Sye ra","telugu","14/Aug/2019"));

    }

}
