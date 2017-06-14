/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinq.spring.data.sample.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.NaturalId;

/**
 *
 * @author fernando
 */
@Entity
@NamedQuery(name="City.findByCountryContainingAllIgnoringCase",
     query="SELECT c.id, c.name, c FROM City c, Country co")
@Table(name="City")
public class City {
    
    private int id;
    private String name;
    @JsonManagedReference
    private Country country;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name="country_id")
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    
}
