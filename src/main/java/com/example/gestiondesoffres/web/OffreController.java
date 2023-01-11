package com.example.gestiondesoffres.web;

import com.example.gestiondesoffres.entities.Offre;
import com.example.gestiondesoffres.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offres")
public class OffreController {
    @Autowired
    OffreRepository offreRepository;
    @GetMapping
    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }
    @GetMapping("/{id}")
    public Offre getOffreById(@PathVariable Long id){
        return offreRepository.findById(id).get();
    }
    @PostMapping
    public Offre saveOffre (@RequestBody Offre newOffre){
        return offreRepository.save(newOffre);
    }
    @DeleteMapping("/{id}")
    public void DeleteOffre(@PathVariable Long id){
        offreRepository.deleteById(id);
    }
    @PutMapping ("/{id}")
    public ResponseEntity<Offre> updatedOffre (@PathVariable Long id , @RequestBody Offre detailsOffre ){
        Offre updatedOffre = offreRepository.findById(id)
        .orElseThrow(()-> new ResourceNotFoundException("Employee with id "+ id+ " does not exist"));
        updatedOffre.setIntitulé(detailsOffre.getIntitulé());
        updatedOffre.setPays(detailsOffre.getPays());
        updatedOffre.setSpecialité(detailsOffre.getSpecialité());
        updatedOffre.setNbpostes(detailsOffre.getNbpostes());
        offreRepository.save(updatedOffre);
        return ResponseEntity.ok(updatedOffre);
    }
}
