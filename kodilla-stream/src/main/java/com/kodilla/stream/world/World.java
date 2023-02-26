package com.kodilla.stream.world;

import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.math.BigInteger.*;

public final class World {

    private final Set<Continent> theWorldSet = new HashSet<>();

    public void addContinent(Continent continent){
        theWorldSet.add(continent);
    }

    public Set<Continent> getTheWorldSet() {
        return theWorldSet;
    }


    @Override
    public String toString() {
        return "World{" +
                "worlSet=" + theWorldSet +
                '}';
    }

    public BigDecimal getPeopleQuanity() {
       return theWorldSet.stream()
               .flatMap(continent -> continent.getCountry().stream())
               .map(Country::getPeopleQuantity)
               .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
