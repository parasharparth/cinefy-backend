package com.cinefy.backend.service;

import com.cinefy.backend.model.AboutUsDomain;
import com.cinefy.backend.repository.AboutUsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutUsServiceImpl implements AboutUsService {

    @Autowired
    private AboutUsRepository aboutUsRepository;

    @Override
    public List<AboutUsDomain> getAboutUsDomains() {
        return aboutUsRepository.findAll();
    }

    public String convert(List<AboutUsDomain> list) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(list);
        return jsonString;
    }
}
