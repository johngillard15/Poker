package com.actors;

import com.game.Actor;

public class Player implements Actor {
    private final String name;
    private int balance;

    public Player(String name){
        this.name = name;
        balance = 1_000;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public byte getAction() {
        return FOLD;
    }

    @Override
    public void addBalance(int amt) {
        balance += amt;
    }
}
