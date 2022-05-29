package com.cinefy.backend.service;

import com.cinefy.backend.model.AboutUsDomain;
import com.cinefy.backend.model.CinefyMovieDomain;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface CinefyService {
      public List<CinefyMovieDomain> getMovies();

      public String convert(List<CinefyMovieDomain> list) throws JsonProcessingException;
}
