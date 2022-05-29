package com.cinefy.backend.service;

import com.cinefy.backend.model.CinefyMovieDomain;
import com.cinefy.backend.repository.CinefyRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    @Override
    public String convert(List<CinefyMovieDomain> list) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(list);
        return jsonString;
    }


}
