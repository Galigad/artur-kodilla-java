package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal getPeopleQuantity;

    public Country(final String countryName, final BigDecimal getPeopleQuantity) {
        this.countryName = countryName;
        this.getPeopleQuantity = getPeopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getGetPeopleQuantity() {
        return getPeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", getPeopleQuantity=" + getPeopleQuantity +
                '}';
    }
}
