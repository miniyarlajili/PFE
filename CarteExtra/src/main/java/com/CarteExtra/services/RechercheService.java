package com.CarteExtra.services;

import com.CarteExtra.Models.Resident;
import com.CarteExtra.Repository.RechercheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RechercheService {
    @Autowired
    private RechercheRepository rechercherepository;



    public List<Resident> getResident(){
        List<Resident> residents=new ArrayList<>();
        rechercherepository.findAll().forEach(resident->{
            residents.add(resident);
                }

        );
        return residents;
    }

    public void deleteResident(long id) {
        rechercherepository.deleteById(id);

    }

    public void addResident(Resident resident) {
        rechercherepository.save(resident);

    }

    public void updateResident(Resident resident, long id) {

        rechercherepository.save(resident);
    }


}
