/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinq.spring.data.resource;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.entity.HelloWorld;
import br.com.cinq.spring.data.sample.repository.CityRepository;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fernando
 */

@Path("/cities")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {

	@Inject
	private CityRepository cityRepository;

/*	@GET
	@Path("teste")
    public HelloWorld teste(){

	    HelloWorld hello = new HelloWorld();
	    return  hello;
	}
*/
    @GET
    public List<City> doGet(@QueryParam("name") String city){
        if (city == null) {
            System.out.print("!!!!!!!!Endpoint CITY by query is ON!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return (cityRepository.findAll());
        }
        System.out.print("!!!!!!!!Endpoint CITY by ALL is ON!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return cityRepository.findByCountryNameContaining(city);

    }


    
}
