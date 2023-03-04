package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
//Given


        int newNumbers[]= {10,10,5,15,10,15,15,40,50,80,10,12,14,18,22,20,36,20,24,10};
        double sum= Arrays.stream(newNumbers).sum();
        double average= sum/20;

        //When
        double result = ArrayOperations.getAverage(newNumbers);
        double expextResult = average;

        //Then
        assertEquals(expextResult, result);
        System.out.println("Show avreage after stream   --"+ Arrays.stream(newNumbers).average());

}
}










