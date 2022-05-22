package com.cinefy.backend.repository;

import com.cinefy.backend.model.AboutUsDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutUsRepository extends JpaRepository<AboutUsDomain,String> {
}
