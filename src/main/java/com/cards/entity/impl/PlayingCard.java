package com.cards.entity.impl;


import com.cards.entity.Card;

/**
 * Implementation of a basic playing card
 */
public class PlayingCard implements Card {
    /**
     * Rank of the card (e.g., Ace, King, 2, etc.)
     */
    private final String rank;
    /**
     * Suit of the card (e.g., Hearts, Diamonds, etc.)
     */
    private final String suit;

    public PlayingCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String getRank() {
        return rank;
    }

    @Override
    public String getSuit() {
        return suit;
    }
}