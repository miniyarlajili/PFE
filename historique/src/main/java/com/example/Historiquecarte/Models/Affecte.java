package com.example.Historiquecarte.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Affecte")
public class Affecte implements Serializable {

    @Id
    @Column(name = "id_carte")
    private Long idCarte;
    @Column(name = "codeReside")
    private String codeReside;
    @Column(name = "dateMdif")
    private Date dateModif;
    @Column(name = "MntTotal")
    private Double MntTotal;





    @ManyToMany
    private Set<Resident> resident;
}
