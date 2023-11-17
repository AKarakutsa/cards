package com.cards.entity;

/**
 * Interface for a generic card
 */
public interface Card {
    /**
     * Method to get the rank of the card
     */
    String getRank();

    /**
     * Method to get the suit of the card
     */
    String getSuit();
}