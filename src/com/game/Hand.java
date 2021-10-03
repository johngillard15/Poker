package com.game;

import com.card.Card;
import com.deck.StandardDeck;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    public List<Card> cards = new ArrayList<>();
    private final Actor holder;

    public Hand(Actor holder){
        this.holder = holder;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public Card getCard(int index){
        return cards.get(index);
    }

    public void clear(){
        cards.clear();
    }

    public void sortBySuit(){
        cards.sort(new StandardDeck.SortBySuit());
    }

    public void sortByValue(){
        cards.sort(new StandardDeck.SortByValue());
    }
}
