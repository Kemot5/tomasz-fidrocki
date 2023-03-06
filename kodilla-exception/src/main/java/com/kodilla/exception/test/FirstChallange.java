package com.kodilla.exception.test;

import java.util.stream.Stream;

public class FirstChallange {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallange firstChallange = new FirstChallange();

        try {
            double result = firstChallange.divide(4, 1);
            System.out.println("Divide =  " + result);
        } catch
                  (ArithmeticException e) {
            System.out.println(" This divide is uncorrect");
        } finally {
            System.out.println(" process is the end");
        }

    }
}

