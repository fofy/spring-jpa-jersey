/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinq.spring.data.sample.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author fernando
 */

@Entity
@Table(name = "Country")
public class Country {

    private int id;
    private String name;
    @JsonBackReference
    private Set<City> city;

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

    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY, targetEntity = City.class, cascade = CascadeType.ALL)
    public Set<City> getCity() {
        return city;
    }

    public void setCity(Set<City> city) {
        this.city = city;
    }


}
