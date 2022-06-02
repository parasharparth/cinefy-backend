package com.cinefy.backend.service;


import com.cinefy.backend.model.AboutUsDomain;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface AboutUsService {
    public List<AboutUsDomain> getAboutUsDomains();

    public String convert(List<AboutUsDomain> list) throws JsonProcessingException;
}
