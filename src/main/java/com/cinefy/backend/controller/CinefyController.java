package com.cinefy.backend.controller;

import com.cinefy.backend.model.AboutUsDomain;
import com.cinefy.backend.model.CinefyMovieDomain;
import com.cinefy.backend.service.AboutUsService;
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

    @Autowired
    private AboutUsService aboutUsService;

    @GetMapping("/movies")
    public List<CinefyMovieDomain> getMovies()
    {
        return cinefyService.getMovies();
    }

    @GetMapping("/Aboutus")
    public List<AboutUsDomain> getAboutUsDomains()
    {
        return aboutUsService.getAboutUsDomains();
    }
}
