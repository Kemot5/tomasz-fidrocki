package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.util.concurrent.Callable;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("TheForumUser");

        String result = simpleUser.getUsername();
        if (result.equals("TheForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");

        }
        System.out.println("------------");
        Calculator dodawanie = new Calculator();
        int result1 = dodawanie.add(10,5);
        if (result1 == 16) {
            System.out.println("Corect");
        }else{
            System.out.println("error calculator");
        }
        System.out.println("--------------");
        Calculator odejmowanie = new Calculator();
        int result2 = odejmowanie.substract(10,5);
        if(result2 == 5){
            System.out.println("Corect");
        }else{
            System.out.println("error calculator");
        }
        }
    }


