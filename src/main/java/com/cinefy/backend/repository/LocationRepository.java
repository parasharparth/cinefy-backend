package com.cinefy.backend.repository;

import com.cinefy.backend.model.LocationDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationDomain,Integer> {
}
