package org.example;

/**
 * Represents a punctuation mark as part of a sentence.
 */
public class Punctuation implements SentenceElement {
    private final char symbol;

    /**
     * Constructor to initialize a Punctuation object.
     *
     * @param symbol the character representing the punctuation mark
     */
    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Returns the string representation of the punctuation mark.
     *
     * @return string representation of the punctuation
     */
    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}

