package com.cinefy.backend.service;

import com.cinefy.backend.model.CinefyMovieDomain;

import java.util.List;

public interface CinefyService {
      public List<CinefyMovieDomain> getMovies();
}
