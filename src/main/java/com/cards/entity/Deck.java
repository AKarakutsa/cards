package com.cards.entity;


import java.util.List;

/**
 * Interface for a deck of cards
 */
public interface Deck {
    /**
     * Method to shuffle the deck
     */
    void shuffle();

    /**
     * Method to deal a specified number of cards
     * @param numberOfCards how much cards must be dealt
     * @return dealt cards
     */
    List<Card> dealCards(int numberOfCards);

    /**
     * Method to reset/fold the deck
     */
    void fold();

    /**
     * Method to return current deck size
     */
    int size();
}