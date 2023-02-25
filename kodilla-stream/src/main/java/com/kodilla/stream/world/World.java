package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigInteger.*;

public final class World {



    public List<Continent> getContinets() {
        List<Continent> continents = new ArrayList<>();
        Continent continent = new Continent();
        continent.getEurope();
        continent.getAmeryka();
        continent.getAsia();
        return continents;
    }
    public BigInteger getPeopleQuanity() {
        BigInteger quantity= (BigInteger) getContinets().stream()
                .flatMap(europa ->europa.getEurope().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current)->sum=sum.add(current));
        return quantity;

    }
}
