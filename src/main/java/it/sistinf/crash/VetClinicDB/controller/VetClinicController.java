package it.sistinf.crash.VetClinicDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.sistinf.crash.VetClinicDB.model.Animal;
import it.sistinf.crash.VetClinicDB.service.VetClinicService;

@RestController
public class VetClinicController {

    @Autowired
    private VetClinicService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Animal> animalDetails() {
		return service.listAll();
    }

    @PostMapping("/animals")
    Animal createOrSaveEmployee(@RequestBody Animal newAnimal) {
        return service.insertAnimal(newAnimal);
    }

    /*
    * AGGIUNGERE UN METODO GET PER IL RECUPERO DEL DETTAGLIO DI UN PAZIENTE
    * ATTRAVERSO UN ID PASSATO COME PATH VARIABLE
    */
    
}