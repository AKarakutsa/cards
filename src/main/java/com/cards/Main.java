package com.cards;

import com.cards.entity.Card;
import com.cards.entity.impl.PlayingCardDeck;

import java.util.List;

// Example usage:
public class Main {
    public static void main(String[] args) {
        testDeckFunctionality();
    }

    public static void testDeckFunctionality() {
        PlayingCardDeck deck = new PlayingCardDeck();

        // Test deck initialization
        int initialDeckSize = deck.dealCards(52).size();
        System.out.println("Initial deck size: " + initialDeckSize);
        assert initialDeckSize == 52 : "Deck should contain 52 cards initially.";

        deck.fold();
        assert deck.size() == 52 : "Deck should contain 52 cards after folding.";

        // Test shuffle
        deck.shuffle();

        // Test dealing cards
        List<Card> hand = deck.dealCards(6);
        System.out.println("Dealing 6 cards:");
        hand.forEach(card -> System.out.println(card.getRank() + " of " + card.getSuit()));
        assert hand.size() == 6 : "Expected to deal 6 cards";
    }
}
