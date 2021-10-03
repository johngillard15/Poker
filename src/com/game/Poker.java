package com.game;

/**
 * <h1>Texas Hold'em</h1>
 *
 * @author John Gillard
 * @since 1/10/2021
 * @version 0.0.1
 */

import com.actors.Player;
import com.deck.Deck;
import com.deck.StandardDeck;

import java.util.ArrayList;
import java.util.List;

/**
 * If hands are the same rank, high card wins (two straights, but one has high card of jack, while winner has queen)
 * P2 wins with Straight, Queen high
 * Two Pair, Ace High
 * kickers are side cards that break ties
 *
 */

public class Poker extends Game {
    private Deck deck;
    private final List<Hand> hands = new ArrayList<>();
    private int MINIMUM_BET = 2;

    public Poker(){
        super(2, 4);
        getPlayers();

        for(Actor player : players)
            hands.add(new Hand(player));
    }

    @Override
    public void play() {
        do{
            round();
            displayResults();
        }while(players.size() > 0);


    }

    private void draw(Hand hand){
        hand.addCard(deck.draw());
    }

    private void roundSetup(){
        deck = new StandardDeck();
        deck.shuffle();

        for(Hand hand : hands)
            hand.clear();

        for(int i = 0; i < 2; i++){
            for(Hand hand : hands)
                draw(hand);
        }


    }

    @Override
    protected void round() {

    }

    @Override
    protected void turn(Player activePlayer) {

    }

    @Override
    protected void displayResults() {

    }
}
