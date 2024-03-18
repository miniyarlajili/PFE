package com.example.Historiquecarte.Repository;


import com.example.Historiquecarte.Models.Affecte;
import com.example.Historiquecarte.Models.Resident;
import com.example.Historiquecarte.Projection.ResidCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface RechercheRepository  extends JpaRepository<Resident, Long> {
  @Query(nativeQuery = true, value = "SELECT r.code_reside,r.date_depart,r.date_arrive,c.mnt_caisse,c.caisse_id FROM caisse c , resident r WHERE c.id_carte = :idCarte and c.id_carte = r.id_carte")
    List<ResidCart> rechercherDonneesParCarte(@Param("idCarte") long idCarte);
    //@Query(nativeQuery = true, value = "SELECT r.code_reside,r.date_depart,r.date_arrive,r.tel,r.email,r.age,r.cinFROM  resident r WHERE c.id_carte = :idCarte and c.id_carte = r.id_carte")
    //List<ResidCart> rechercherDonneesParCarte(@Param("idCarte") long idCarte);





}
