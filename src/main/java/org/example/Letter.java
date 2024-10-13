package org.example;

/**
 * Represents a letter in a word.
 */
public class Letter {
    private final char character;

    /**
     * Constructor to initialize a Letter object.
     *
     * @param character the character that represents the letter
     */
    public Letter(char character) {
        this.character = character;
    }

    /**
     * Returns the character associated with this letter.
     *
     * @return the character of the letter
     */
    public char getCharacter() {
        return character;
    }

    /**
     * Determines whether the letter is a vowel based on the provided array of vowels.
     *
     * @param vowels an array of characters representing vowels
     * @return {@code true} if the letter is a vowel, {@code false} otherwise
     */
    public boolean isVowel(char[] vowels) {
        for (char vowel : vowels) {
            if (character == vowel)
                return true;
        }
        return false;
    }

    /**
     * Returns the string representation of the letter (its character).
     *
     * @return the string representation of the character
     */
    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
