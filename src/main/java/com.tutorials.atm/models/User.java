package com.tutorials.atm.models;

import java.util.UUID;

public class User {
    private String name;
    private UUID id;
    private Card card;

    // No one can create an object of this class: User user = new User(); This will throw error;
    private User() {
    }

    // User user = new User("John");
    public User(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
