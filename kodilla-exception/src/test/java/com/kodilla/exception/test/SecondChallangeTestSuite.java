package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeTestSuite {
    @Test
    void secondChallangeYwrong() {
        //Given
        SecondChallange secondChallange = new SecondChallange();
        double x = 1.5;
        double y = 1.5;
        //When && then
        assertThrows(Exception.class, () -> secondChallange.probabllyWillThrowException(x, y));
    }
        @Test
        void secondChalangeXwrongIsExackly2 () {
            //Given
            SecondChallange secondChallange = new SecondChallange();
            double x = 2;
            double y = 5;
            //When && then
            assertThrows(Exception.class, () -> secondChallange.probabllyWillThrowException(x, y));
        }
    @Test
    void secondChalangeXwrongIsLess1 () {
        //Given
        SecondChallange secondChallange = new SecondChallange();
        double x = 0.99;
        double y = 5;
        //When && then
        assertThrows(Exception.class, () -> secondChallange.probabllyWillThrowException(x, y));
    }

    }



