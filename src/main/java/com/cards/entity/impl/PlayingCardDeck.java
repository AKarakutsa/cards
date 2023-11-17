package com.cards.entity.impl;


import com.cards.entity.Card;
import com.cards.entity.Deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Implementation of a deck of playing cards
 */
public class PlayingCardDeck implements Deck {
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    /**
     * List to hold the cards in the deck
     */
    private final List<Card> cards = new ArrayList<>(ranks.length * suits.length); // Creates a new list for cards

    public PlayingCardDeck() {
        initializeDeck(); // Initializes a standard deck of playing cards
    }

    private void initializeDeck() {
        // Populates the deck with 52 cards (13 ranks in 4 suits)
        Arrays.stream(ranks).forEach(suit ->
                Arrays.stream(suits).forEach(rank ->
                        cards.add(new PlayingCard(rank, suit)) // Creates a card and adds it to the deck
                )
        );
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards); // Shuffles the deck using the Collections.shuffle method
    }

    @Override
    public List<Card> dealCards(int numberOfCards) {
        if (numberOfCards > cards.size()) {
            System.out.println("Not enough cards in the deck!");
            return Collections.emptyList();
        }
        // Deals the specified number of cards from the deck
        List<Card> dealtCards = new ArrayList<>(cards.subList(0, numberOfCards));
        cards.removeAll(dealtCards); // Removes a card from the deck and adds it to dealt cards
        return dealtCards; // Returns the list of dealt cards
    }

    @Override
    public void fold() {
        cards.clear(); // Clears the deck, essentially resetting it
        initializeDeck(); // Reinitialize the deck after folding
    }

    @Override
    public int size() {
        return cards.size();
    }
}
