package br.com.cinq.spring.data.sample.repository;

/**
 * Created by fernando on 13/06/17.
 */
import java.util.List;

import br.com.cinq.spring.data.sample.entity.Country;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fernando
 */
public interface CountryRepository extends JpaRepository<Country,Integer> {

    List<Country> findAll();
    List<Country> findByNameContaining(String name);



}