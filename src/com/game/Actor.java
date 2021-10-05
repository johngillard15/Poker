package com.game;

public interface Actor {
    byte FOLD = 0;
    byte CALL = 1;
    byte CHECK = 2;
    byte RAISE = 3;

    String getName();
    byte getAction();
    void addBalance(int amt);
}
