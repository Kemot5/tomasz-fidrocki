package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    void testCheckAddCalculator() {
        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Calculator calculator= context.getBean(Calculator.class);
        //When
          calculator.add(2, 15);
        //Then
    }
    @Test
    void testCheckSubstractCalculator() {
        //Given
        //When
        calculator.sub(20,13);
        //Then
    }
    @Test
    void testCheckMultiplaystractCalculator() {
        //Given
        //When
        calculator.mul(5,5);
        //Then
    }
    @Test
    void testCheckDividetractCalculator() {
        //Given
        //When
        calculator.div(40,5);
        //Then
    }
}
