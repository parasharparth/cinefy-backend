package com.cinefy.backend.repository;

import com.cinefy.backend.model.CinefyMovieDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CinefyRepository  extends JpaRepository<CinefyMovieDomain,Integer> {
}
