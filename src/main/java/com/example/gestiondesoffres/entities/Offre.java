package com.example.gestiondesoffres.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offre {
    @Id @GeneratedValue
    Long code;
    String intitulé ;
    String specialité ;
    String pays;
    int nbpostes;
}
