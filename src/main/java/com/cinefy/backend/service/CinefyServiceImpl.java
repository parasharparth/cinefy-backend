package com.cinefy.backend.service;

import com.cinefy.backend.model.CinefyMovieDomain;
import com.cinefy.backend.repository.CinefyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CinefyServiceImpl implements CinefyService {

    @Autowired
    private CinefyRepository cinefyRepository;

    @Override
    public List<CinefyMovieDomain> getMovies()
    {
       return cinefyRepository.findAll();
    }
}
