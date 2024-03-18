package com.example.Historiquecarte.Service;

import com.example.Historiquecarte.Models.Resident;

import java.util.Date;
import java.util.List;

public interface IRecherche {
   // public List<Object[]> rechercherDonneesParCarte(String idCarte) ;
    public List<Object[]> afficher (Long idcarte);
    public List<Object[]> affichercaisse (Long idcarte);
    }
