package com.cinefy.backend.service;

import com.cinefy.backend.model.AboutUsDomain;
import com.cinefy.backend.repository.AboutUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutUsServiceImpl implements AboutUsService{

    @Autowired
    private AboutUsRepository aboutUsRepository;

    @Override
    public List<AboutUsDomain> getAboutUsDomains() {
        return aboutUsRepository.findAll();
    }
}
