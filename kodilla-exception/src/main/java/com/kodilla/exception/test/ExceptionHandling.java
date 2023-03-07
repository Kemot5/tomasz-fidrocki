package com.kodilla.exception.test;


import com.kodilla.exception.main.ExceptionModuleRunner;

public class ExceptionHandling {
    public static  void main(String[] args)  //throws  Exception11
     {
        SecondChallange secondChallange = new SecondChallange();

        try {
            secondChallange.probabllyWillThrowException(1.5,1.5);

        } catch (Exception e) {
           // throw  new Exception11(); // zapytać czemu nie wrzuca np. sout ?????
            System.out.println("One of arguments is exceptions");

        } finally {

            System.out.println(" Done- all corrent" );
        }

    }
}
