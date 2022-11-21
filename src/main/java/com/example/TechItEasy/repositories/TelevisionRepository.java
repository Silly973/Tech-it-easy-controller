package com.example.TechItEasy.repositories;

import com.example.TechItEasy.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// stap 24 Extend de repository met de JpaRepository en geef de juiste attributen mee
public interface TelevisionRepository extends JpaRepository<Television, Long> {
    Optional<Television> findByBrand(String brand);
}
