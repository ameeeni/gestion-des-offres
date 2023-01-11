package com.example.gestiondesoffres;

import com.example.gestiondesoffres.entities.Offre;
import com.example.gestiondesoffres.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestiondesoffresApplication implements CommandLineRunner {
@Autowired
    OffreRepository offreRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestiondesoffresApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        offreRepository.save(new Offre(null , "Developpeur backEnd" , "Software Engineering" , "Tunis" ,4));
        offreRepository.save(new Offre(null , "Developpeur fullStack" , "Software Engineering" , "france" ,6));
        offreRepository.save(new Offre(null , "Developpeur Mobile" , "Software Engineering" , "Germany" ,4));

    }
}
