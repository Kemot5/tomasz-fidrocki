package com.kodilla.testing.collection;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.*;
import org.w3c.dom.ls.LSOutput;

import java.util.*;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTestSuit {
    private static int testCounter= 0;
    @BeforeEach
            public void beforeTest() {

        testCounter++;
        System.out.println(" Start test is run   "+ testCounter);
    }
    @AfterEach
        public  void afterEachTest() {
        System.out.println(" Test   " + testCounter + " is over");
        System.out.println("");
    }


    @DisplayName(" When list is Empty should give null")
    @Test
    void testOddNumbersExterminatorEmptyList()
        {
        //Given

            OddNumberExterminator exterminator = new OddNumberExterminator();
            List<Integer>numbers = new ArrayList<>();


        //When

            List<Integer> result = exterminator.exterminate(numbers);

        System.out.println("Testing result  " + result);
        //Then
        assertEquals(0,result.size());

    }


    @DisplayName(" Test when is a any numbers and pass method conditions")
    @Test
    void testOddNumbersExterminatorNormalList() {
  // Given
        OddNumberExterminator exterminator = new OddNumberExterminator();
        List<Integer>numbers = new ArrayList<>();

         numbers.add(4);
         numbers.add(1);
         numbers.add(3);

         List<Integer> nowa= new ArrayList<>();
         nowa.add(4);
     //When
     List<Integer> result1 = exterminator.exterminate(numbers);
        System.out.println(" Testing result   " + result1);
     // Then
     Assertions.assertEquals(nowa, result1);
    }

}



