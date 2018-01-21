package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private Set<Continent> world = new HashSet<>();
    public void addContinent(Continent continent) {
        world.add(continent);
    }

    public Set<Continent> getWorld() {
        return world;
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal total = world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getGetPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));
        return total;
    }
}
