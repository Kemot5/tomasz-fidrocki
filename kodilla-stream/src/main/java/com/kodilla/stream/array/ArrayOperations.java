package com.kodilla.stream.array;

import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

             IntStream.range(0, numbers.length)
                     .map(i->numbers[i])
                                     .forEach(System.out::println);


        Double averageNumber = IntStream.range(0, numbers.length)
                .mapToDouble(i->numbers[i])

                    .average()
                .orElse(0);

            return averageNumber;

        }
}


