package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(RollEnum roll) {
            this.roll = roll.toString();
            return this;
        }

        public BigmacBuilder burgers(int quantity) {
            this.burgers = quantity;
            return this;
        }

        public BigmacBuilder sauce(SauceEnum sauce) {
            this.sauce = sauce.toString();
            return this;
        }

        public BigmacBuilder ingredient(IngridientsEnum ingredient) {
            ingredients.add(ingredient.toString());
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }

    }

    public Bigmac(final String roll, final int burgers, final String sauce, final List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public enum RollEnum {
        classic, sesame;
    }

    public enum SauceEnum {
        standard, thousandIslandDressing, barbecue;
    }

    public enum IngridientsEnum {
        lettuce, onion, bacon, cucumber, chilliPeppers, mushrooms, shrimp, cheese;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
