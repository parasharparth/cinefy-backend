package com.cinefy.backend.controller;

import com.cinefy.backend.model.CinefyMovieDomain;
import com.cinefy.backend.service.CinefyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cinefy")
@CrossOrigin
public class CinefyController {

    @Autowired
    private CinefyService cinefyService;

    @GetMapping("/movies")
    public List<CinefyMovieDomain> getMovies()
    {
        return cinefyService.getMovies();
    }


}
