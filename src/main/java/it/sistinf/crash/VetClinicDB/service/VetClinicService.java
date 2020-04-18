package it.sistinf.crash.VetClinicDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.sistinf.crash.VetClinicDB.model.Animal;
import it.sistinf.crash.VetClinicDB.repositories.AnimalsRepository;

@Service
public class VetClinicService {

    @Autowired
    private AnimalsRepository repository;

    public AnimalsRepository getRepository() {
        return repository;
    }

    public void setRepository(AnimalsRepository repository) {
        this.repository = repository;
    }

    public List<Animal> listAll(){
        return repository.findAll();   
    }

    public Animal insertAnimal(Animal newAnimal){
        return repository.save(newAnimal);
    }
    

}