package com.kodilla.stream.beautfier;

public class PoemBeautfier {
    public void beautify(String name, String colours,PoemDecorator poemDecorator) {
        String result= poemDecorator.decorate(name, colours).toUpperCase();// jak odzielić na jedna linie duze litery
        System.out.println("Opis Kwiatu -  " + result);
        System.out.println("Nazwa  -  " + result);
        System.out.println(" Rodzaj -  " + result);
    }
}
