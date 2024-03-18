package com.example.Historiquecarte.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Caisse")
public class Caisse implements Serializable {
    private static final long serialVersionUID = 1L ;
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "dateModif")
    private Date dateModif;
    @Column(name = "idCarte")
    private String idCarte;
    @Column(name = "MntCaisse")
    private Double MntCaisse;

   @ManyToOne
    @JsonIgnore
  private Resident caisse;
}
