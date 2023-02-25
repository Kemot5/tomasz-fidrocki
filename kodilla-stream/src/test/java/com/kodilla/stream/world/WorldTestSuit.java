package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuit {
    @Test
    void testGetPeopleQuanity() {
        //Given
        List<Country>europe = new ArrayList<>();
        europe.add(new Country("anglia","350000000"));
        europe.add(new Country("polska","450000000"));

        //When
        BigInteger result= "800000000";
        BigInteger result1= (BigInteger) europe;

        assertEquals(result,result1);


    }
}




