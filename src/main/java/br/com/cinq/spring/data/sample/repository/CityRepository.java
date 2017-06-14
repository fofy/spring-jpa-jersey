/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinq.spring.data.sample.repository;

import br.com.cinq.spring.data.sample.entity.City;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fernando
 */
public interface CityRepository extends JpaRepository<City,Integer> {
    
    List<City> findByCountryNameContaining(String name);
    City findByName(String name);
    List<City> findAll();



}
