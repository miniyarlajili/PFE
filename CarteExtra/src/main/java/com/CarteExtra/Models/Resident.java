package com.CarteExtra.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Data

@Entity
@Table(name = "Resident")
public class Resident implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "id_carte")
        private Long id_carte;
        @Column(name = "nom")
        private String nom;
        @Column(name = "code")
        private Long code;

        @Column(name = "date_depart")
        private LocalDateTime date_Depart;

        @Column(name = "date_arrive")
        private Date date_Arrive;

        @Column(name = "tel")
        private String tel;

        @Column(name = "email")
        private String email;

        @Column(name = "age")
        private Long age;

        @Column(name = "cin")
        private String cin;

        @Column(name = "num_chambre")
        private Long num_Chambre;

        public Resident(Long id, Long id_carte, Long code, LocalDateTime date_Depart, Date date_Arrive, String tel, String email, Long age, String cin, Long num_Chambre) {
                this.id = id;
                this.id_carte = id_carte;
                this.code = code;
                this.date_Depart = date_Depart;
                this.date_Arrive = date_Arrive;
                this.tel = tel;
                this.email = email;
                this.age = age;
                this.cin = cin;
                this.num_Chambre = num_Chambre;
        }

        public Resident() {
        }
}