package com.cinefy.backend.repository;

import com.cinefy.backend.model.PriceDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<PriceDomain, Integer> {
}
