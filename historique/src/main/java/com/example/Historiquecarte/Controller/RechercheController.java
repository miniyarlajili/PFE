package com.example.Historiquecarte.Controller;


import com.example.Historiquecarte.Models.Resident;
import com.example.Historiquecarte.Projection.ResidCart;
import com.example.Historiquecarte.Repository.RechercheRepository;
import com.example.Historiquecarte.Service.IRecherche;
import com.example.Historiquecarte.Service.RechercheSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/recherche")
public class RechercheController {
    @Autowired
    private RechercheRepository rechercheRepository;

    /*
@Autowired
    ResidentRepository iRecherche;
@Autowired
CaisseRepository caisseRepository;
  //  @GetMapping("/carte/{idCarte}")
   // public List<Object[]> rechercherDonnéesParCarte(@PathVariable String idCarte) {
     //   return rechercheService.rechercherDonneesParCarte(idCarte);
    //}
    @CrossOrigin
    @GetMapping(value = "/carte/{idCarte}")
    public List<Object[]> afficherdetails (@PathVariable Long idCarte){

        return  iRecherche.afficherdetailresident(idCarte);
    }
    /*
    @CrossOrigin
    @GetMapping(value = "/caisse/{idCarte}")
    public List<Object[]>   afficherdetailcaisse (@PathVariable Long idCarte){

        return  caisseRepository.afficherdetailcaisse(idCarte);
    }
 //   @GetMapping(value= "/getall/{id}")
   // public List<Object[]> getalls(@PathVariable Long id){
     //   List<Object[]> resident = iRecherche.afficherdetailresident(id);
       // List<Object[]> caisse = caisseRepository.afficherdetailcaisse(id);
       //return List<Object[]> resident,caisse;

    //}
/*    @CrossOrigin
    @GetMapping(value= "/getall/{id}")
    public Map<String, List<Object[]>> getalls(@PathVariable Long id) {
        Map<String, List<Object[]>> result = new HashMap<>();
        List<Object[]> resident = iRecherche.afficherdetailresident(id);
        List<Object[]> caisse = caisseRepository.afficherdetailcaisse(id);
        result.put("resident", resident);
        result.put("caisse", caisse);
        return result;
    }
*/

    @CrossOrigin(origins = "*")
    @PostMapping(value= "/getall")
    public List<ResidCart>  getalls(@RequestBody Long id) {

       return rechercheRepository.rechercherDonneesParCarte(id);
    }

}

