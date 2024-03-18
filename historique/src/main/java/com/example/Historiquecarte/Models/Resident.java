package com.example.Historiquecarte.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Resident")
public class Resident implements Serializable {
private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Long id ;
    @Column(name = "codeReside")
    private Long codeReside;
    @Column(name = "codeResideP")
    private Long codeResideP;
    @Column(name = "idCarte")
     private Long idCarte;
    @Column(name = "dateArrive")
    private Date dateArrive;
    @Column(name = "datrDepart")
    private Date dateDepart;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private int age;
    @Column(name = "tel")
    private String tel;
    @Column(name = "CIN")
  private String cin;
 @Column(name = "nmbrChamber")
    private Long numChambre;

   @ManyToMany(mappedBy = "resident")
    @JsonIgnore
  private Set<Affecte> residents;
   @OneToMany(mappedBy = "caisse")
  @JsonIgnore
    private Set<Caisse> caisses;

}
