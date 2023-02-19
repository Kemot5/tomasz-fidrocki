package com.kodilla.stream;

import com.kodilla.stream.beautfier.PoemBeautfier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main(String[] args) {

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println();

        PoemBeautfier poemBeautfier = new PoemBeautfier();
        System.out.println(" List of flouers");
        poemBeautfier.beautify("Bratek", "zielony",(name,colours)->name+" "+colours);
        System.out.println();
        poemBeautfier.beautify("Róza", "czerwona",(name,colours)->name+"  "+colours);
        System.out.println();
        poemBeautfier.beautify("Tulipan", "yelow",(name,colours)->name+"  Pospolity  "+colours);

        System.out.println();
        PoemBeautfier poemBeautfier1 = new PoemBeautfier();
        System.out.println(" polskie kiwaty");
        poemBeautfier1.beautify("Bratek", "zielony",(name,colours)->name+" "+colours);
        System.out.println();
        poemBeautfier1.beautify("Róza", "czerwona",(name,colours)->name+"  "+colours);
        System.out.println();;
        poemBeautfier1.beautify("Tulipan", "yelow",(name,colours)->name+"  Pospolity  "+colours);


    }
}