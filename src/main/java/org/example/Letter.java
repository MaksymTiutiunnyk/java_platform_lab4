package org.example;

public class Letter {
    private final char character;

    public Letter(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public boolean isVowel(char[] vowels) {
        for (char vowel : vowels) {
            if (character == vowel)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
