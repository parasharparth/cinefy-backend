package com.cinefy.backend.repository;

import com.cinefy.backend.model.NumberOfTicketsDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberOfTicketsRepository extends JpaRepository<NumberOfTicketsDomain, Integer> {
}
