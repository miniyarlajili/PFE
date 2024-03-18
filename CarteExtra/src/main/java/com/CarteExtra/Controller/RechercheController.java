package com.CarteExtra.Controller;

import com.CarteExtra.Models.Resident;
import com.CarteExtra.Projection.ResidCart;
import com.CarteExtra.Repository.RechercheRepository;
import com.CarteExtra.services.RechercheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@CrossOrigin(origins = "localhost:4200")


    @RestController
    @RequestMapping("/recherche")
    public class RechercheController {
        @Autowired
        private RechercheRepository rechercheRepository;
        @Autowired
        private RechercheService rechercheService;


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

        @GetMapping(value = "getall/{id}")
        public List<Resident> getalls(@PathVariable Long id) {

            return rechercheRepository.rechercherDonneesParCarte(id);
        }
    @GetMapping(value = "getdata/{nom}")
    public List<Resident> getdata(@PathVariable String nom) {

        return rechercheRepository.rechercherDonneesParnom(nom);

    }
    @GetMapping(value = "getdata2/{nom}")
    public List<Resident> getdata2(@PathVariable String nom) {

        return rechercheRepository.rechercherDonneesParnom(nom);
    }
    @GetMapping(value = "getchambre/{chambre}")
    public List<Resident> getchambre(@PathVariable Long chambre) {

        return rechercheRepository.rechercherDonneesParchambre(chambre);
    }
    @GetMapping(value = "/dates/{date}")
    public List<Resident> getdate(@PathVariable  @DateTimeFormat(pattern = "yyyy-MM-dd")Date date) {
        return rechercheRepository.rechercherDonneesPardate(date);
    }
    @GetMapping(value = "/arrive/{dateArv}")
    public List<Resident> getdateA(@PathVariable  @DateTimeFormat(pattern = "yyyy-MM-dd")Date dateArv) {
        return rechercheRepository.rechercherDonneesPardateArrive(dateArv);
    }



    @GetMapping(value="/get")
        public List<Resident> getResident() {
            return rechercheService.getResident();
        }

        @RequestMapping(method =RequestMethod.DELETE,value="/resident/{id}")
        public void deleteCar(@PathVariable long id) {
            rechercheService.deleteResident(id);
        }
        @RequestMapping(method =RequestMethod.POST,value="/residents")
        public void addResident(@RequestBody Resident resident) {
            rechercheService.addResident(resident);
        }
        @RequestMapping(method =RequestMethod.PUT,value="/res/{id}")
        public void updateCar(@RequestBody Resident resident,@PathVariable long id) {
            rechercheService.updateResident(resident,id);
        }
    }
