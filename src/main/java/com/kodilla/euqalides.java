package com.kodilla;

public class euqalides {

    public static void main (String[] args) {
        int a=100;
        int b=24;

        while(!(a==b)) {
            if (a > b) {
                a -= b;


            System.out.println("next time number" +a);
        }else {
                b-=a;

                System.out.println("second argument" + b );
            }//


        }
        int nwd=b;
        System.out.println("found number is - " +nwd );
    }
}
