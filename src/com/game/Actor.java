package com.game;

public interface Actor {
    byte ACTION = 0;

    String getName();
    byte getAction();
    void addBalance(int amt);
}
