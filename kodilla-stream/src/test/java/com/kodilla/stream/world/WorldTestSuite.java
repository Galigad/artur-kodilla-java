package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal(("37950000")));
        Country ukraine = new Country("Ukraina", new BigDecimal("45000000"));
        Country unitedKingdom = new Country("United Kingdom", new BigDecimal("65640000"));
        Country russia = new Country("Russia", new BigDecimal("144300000"));
        Country japan = new Country("Japan", new BigDecimal("127000000"));
        Country china = new Country("China", new BigDecimal("1379000000"));
        Country india = new Country("India", new BigDecimal("1200000000"));
        Country usa = new Country("United States of America", new BigDecimal("325000000"));
        Country argentina = new Country("Argentina", new BigDecimal("43840000"));
        Country brazil = new Country("Brazil", new BigDecimal("208000000"));
        Country germany = new Country("Germany", new BigDecimal("82800000"));
        Country spain = new Country("Spain", new BigDecimal("46350000"));
        Country france = new Country("France", new BigDecimal("67200000"));
        Country italy = new Country("Italy", new BigDecimal("61000000"));
        Continent europe = new Continent("Europe");
        Continent southAmerica = new Continent("South America");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");
        World world = new World();
        //When
        europe.addCountry(poland);
        europe.addCountry(italy);
        europe.addCountry(france);
        europe.addCountry(germany);
        europe.addCountry(spain);
        europe.addCountry(ukraine);
        europe.addCountry(unitedKingdom);
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(russia);
        asia.addCountry(india);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(brazil);
        northAmerica.addCountry(usa);
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);
        world.addContinent(northAmerica);
        //Then
        BigDecimal total = new BigDecimal("3833080000");
        Assert.assertEquals(total, world.getPeopleQuantity());
    }
}
