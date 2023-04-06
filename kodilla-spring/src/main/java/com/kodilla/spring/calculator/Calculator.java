package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {
    private Display display;



    public Calculator(final Display display) { // metoda przez construktor
        this.display = display;
    }
//    @Autowired
//    private Display display;

    void add(double a, double b) {
        double sum= a+b;
        display.displayValue(1);
        System.out.println(" Calculator result = " +sum);
    }
    void sub(double a, double b) {
        double substract = a - b;
        display.displayValue(2);
        System.out.println(" Calculator result = " +substract);
    }
    void mul(double a,double b) {
        double multiplay = a * b;
        display.displayValue(3);
        System.out.println(" Calculator result = " +multiplay);
    }
    void div(double a, double b) {
        double divide = a / b;
        display.displayValue(4);
        System.out.println(" Calculator result = " +divide);
    }

}
