package br.com.cinq.spring.data.sample.application;

import javax.ws.rs.ApplicationPath;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

import br.com.cinq.spring.data.resource.SampleResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * Register Jersey modules
 * @author Adriano Kretschmer
 */
@Configuration
@Component
@ApplicationPath("/rest")
public class Config extends ResourceConfig {

    public Config() {
        register(SampleResource.class);
        //		packages("br.com.cinq.greet.resource");
        //property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }


}