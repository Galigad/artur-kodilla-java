package com.kodilla.good.patterns.challenges.exampleShop;

public class OrderTo {
    public User user;
    public boolean isOrdered;

    public OrderTo(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}

