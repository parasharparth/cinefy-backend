package com.cinefy.backend.controller;

import com.cinefy.backend.model.CinefyMovieDomain;
import com.cinefy.backend.model.FeaturedMovieDomain;
import com.cinefy.backend.repository.FeaturedMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cinefy/")
public class FeaturedMovieController {

    @Autowired
    private FeaturedMovieRepository featuredMovieRepository;


    /**********************************************************************************
     * This method will fetch the list of movies to be displayed on the home page
     * @return list of all the movies
     ***********************************************************************************/
    @RequestMapping("/home")
    public List<FeaturedMovieDomain> getCinefyMovieDomains()
    {
        return featuredMovieRepository.findAll();
    }
}
