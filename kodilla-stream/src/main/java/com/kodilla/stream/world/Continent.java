package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public final class  Continent {
    List<Country> country = new ArrayList<>();


    public List<Country> getCountry() {


        return  country;
    }

    public void addCountry(Country country) {
        this.country.add(country);
}
}




