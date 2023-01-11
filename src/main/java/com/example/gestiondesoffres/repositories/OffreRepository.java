package com.example.gestiondesoffres.repositories;

import com.example.gestiondesoffres.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}
