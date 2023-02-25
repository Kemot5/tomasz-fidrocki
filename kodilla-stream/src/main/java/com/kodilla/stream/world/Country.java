package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class Country {
    private final String nameCountry;
    private final BigInteger peopleQuantity;

    public  Country(String nameCountry, BigInteger peopleQuantity) {
        this.nameCountry = nameCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country country)) return false;
        return Objects.equals(nameCountry, country.nameCountry) && Objects.equals(peopleQuantity, country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCountry, peopleQuantity);
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
