package br.com.cinq.spring.data.repository.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.cinq.spring.data.sample.application.Application;
import br.com.cinq.spring.data.sample.entity.City;
import br.com.cinq.spring.data.sample.repository.CityRepository;

import java.util.List;

/**
 * Eye candy: implements a sample in using JpaRespositories
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(randomPort = true)
@IntegrationTest("server.port=9000")
@ActiveProfiles("unit")
public class CityRepositoryTest {

    @Autowired
    private CityRepository dao;

    @Test
    public void testOneCity() {

        Assert.assertNotNull(dao);
        
        Assert.assertTrue(dao.count()>0);

        City city = new City();
        city.setId(3); // Should be Manaus

        City cityTest = dao.findByName(city.getName());

        Assert.assertEquals("Manaus", cityTest.getName());

    }

    @Test
    public void testAllCity() {

        Assert.assertNotNull(dao);

        long count = dao.count();

        Assert.assertTrue(dao.count()>0);

        List<City> cities = dao.findAll();

        Assert.assertEquals((int) count, cities.size());

    }
}
