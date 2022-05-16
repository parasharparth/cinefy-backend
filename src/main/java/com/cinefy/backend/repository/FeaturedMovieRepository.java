package com.cinefy.backend.repository;

import com.cinefy.backend.model.FeaturedMovieDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface FeaturedMovieRepository extends JpaRepository<FeaturedMovieDomain, Long> {

        //This will internally provide all the CRUD operations which can be called in the controller
        //JPA Repository is an excellent way to build on the internal capabilities of spring CRUD operations
    }
