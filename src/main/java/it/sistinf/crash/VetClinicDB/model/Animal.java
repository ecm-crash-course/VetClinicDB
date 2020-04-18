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
    private String owner_mail;

    public Animal(String _kind, String _first_name, String _owner_mail){
        this.kind = _kind;
        this.first_name = _first_name;
        this.owner_mail = _owner_mail;
    }

}