package org.example;

public class Punctuation implements SentenceElement {
    private final char symbol;

    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
