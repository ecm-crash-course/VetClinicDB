package it.sistinf.crash.VetClinicDB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.sistinf.crash.VetClinicDB.model.Animal;

@Repository
public interface AnimalsRepository extends JpaRepository<Animal, Long> {

    
}