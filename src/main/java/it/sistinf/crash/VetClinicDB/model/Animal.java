package it.sistinf.crash.VetClinicDB.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Entity
@RequiredArgsConstructor
@Getter
@Table(name="TBL_ANIMALS")
public final class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;

    private String kind;
    private String first_name;
    
    @Column(name="owner_email")
    private String email;

    public Animal(String _kind, String _first_name, String _owner_email){
        this.kind = _kind;
        this.first_name = _first_name;
        this.email = _owner_email;
    }

}