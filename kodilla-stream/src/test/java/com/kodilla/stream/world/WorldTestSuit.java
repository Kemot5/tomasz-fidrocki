package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuit {
    @Test
    void testGetPeopleQuanity() {
        //Given

        Country france = new Country("France","150000000000000");
        Country poland= new Country("Poland", "50000000");
        Country china = new Country("China", "580060000000");
        Country usa = new Country("Usa", "78454122222222");
        Country canada= new Country("Canada", "450000000050");
        Country mexico= new Country("Mexico", "201050444444");
        Country german = new Country("German", "879451222222");
        Country india = new Country("India", "999999999999999");
        Country taiwan = new Country("Taiwan", "2564849841");
        Continent europa = new Continent();
        europa.addCountry(france);
        europa.addCountry(poland);
        europa.addCountry(german);
        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(taiwan);
        Continent ameryka = new Continent();
        ameryka.addCountry(usa);
        ameryka.addCountry(canada);
        ameryka.addCountry(mexico);
        World world = new World();
        world.addContinent(europa);
        world.addContinent(ameryka);
        world.addContinent(asia);
        //When
        BigDecimal result= new BigDecimal("88888888888888");
        BigDecimal result1= world.getPeopleQuanity();
        //Then

        assertEquals(result,result1);


    }
}




