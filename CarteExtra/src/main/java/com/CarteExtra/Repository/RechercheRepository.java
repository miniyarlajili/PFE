package com.CarteExtra.Repository;

import com.CarteExtra.Models.Resident;
import com.CarteExtra.Projection.ResidCart;
import jakarta.persistence.TemporalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface RechercheRepository extends CrudRepository<Resident, Long> {
    @Query(value = "select * from resident  where id_carte = :idcarte",nativeQuery = true)
   List<Resident>  rechercherDonneesParCarte(@Param("idcarte") long idcarte);
    //@Query(value = "select * from resident  where nom = :nom",nativeQuery = true)
    //List<Resident>  rechercherDonneesParnom(@Param("nom") String nom);
    @Query(value = "select * from resident  where nom LIKE :premiereLettre%",nativeQuery = true)
    List<Resident>  rechercherDonneesParnom(@Param("premiereLettre") String nom);
    @Query(value = "select * from resident  where num_Chambre = :num_Chambre",nativeQuery = true)
    List<Resident>  rechercherDonneesParchambre(@Param("num_Chambre") Long num_Chambre);
    @Query(value ="SELECT * FROM resident WHERE date_Depart = :date_Depart LIMIT 0, 25",nativeQuery = true)
    List<Resident>  rechercherDonneesPardate(@Param("date_Depart")Date date_Depart);
    @Query(value ="SELECT * FROM resident WHERE date_Arrive = :date_Arrive LIMIT 0, 25",nativeQuery = true)
    List<Resident>  rechercherDonneesPardateArrive(@Param("date_Arrive")Date date_Arrive);



}
    //@Query(nativeQuery = true, value = "SELECT r.code_reside,r.date_depart,r.date_arrive,r.tel,r.email,r.age,r.cinFROM  resident r WHERE c.id_carte = :idCarte and c.id_carte = r.id_carte")
    //List<ResidCart> rechercherDonneesParCarte(@Param("idCarte") long idCarte);



