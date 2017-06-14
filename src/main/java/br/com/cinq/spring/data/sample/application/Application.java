package br.com.cinq.spring.data.sample.application;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import org.springframework.context.ApplicationContext;
import javax.ws.*;

/**
 * Greeting Service.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "br.com.cinq.spring.data.sample" })
@EntityScan(basePackages = { "br.com.cinq.spring.data.sample.entity" })
@EnableJpaRepositories("br.com.cinq.spring.data.sample.repository")
@EnableAutoConfiguration

public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(Application.class);

    }

    public static void main(String[] args) {
        new Application().configure(
                new SpringApplicationBuilder(Application.class)
        ).run(args);

    }
}
