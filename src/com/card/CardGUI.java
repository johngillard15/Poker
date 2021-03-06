package com.card;

import com.deck.StandardDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGUI {
    public static void showCard(Card card){
        System.out.println(StandardDeck.getCardGUI(card));
    }

    public static void showHand(List<Card> hand){
        List<Scanner> scannerList = new ArrayList<>();
        for(Card card : hand)
            scannerList.add(new Scanner(StandardDeck.getCardGUI(card)));

        while(scannerList.get(0).hasNextLine()){
            StringBuilder line = new StringBuilder();
            for(Scanner scanner : scannerList)
                line.append(scanner.nextLine()).append(" ");
            System.out.printf("%s\n", line);
        }

        for(Scanner scanner : scannerList)
            scanner.close();
    }
}
