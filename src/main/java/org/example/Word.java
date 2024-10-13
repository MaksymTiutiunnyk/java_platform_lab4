package org.example;

/**
 * Represents a word consisting of multiple letters.
 */
public class Word implements SentenceElement {
    private final Letter[] letters;

    /**
     * Constructor to initialize a Word object from a string.
     *
     * @param word the string representing the word
     */
    public Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++)
            letters[i] = new Letter(word.charAt(i));
    }

    /**
     * Counts the number of vowels in the word.
     *
     * @param vowels an array of characters representing vowels
     * @return the number of vowels in the word
     */
    public int countVowels(char[] vowels) {
        int count = 0;
        for (Letter letter : letters) {
            if (letter.isVowel(vowels))
                count++;
        }
        return count;
    }

    /**
     * Returns the string representation of the word.
     *
     * @return string representation of the word
     */
    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : letters)
            wordString.append(letter);

        return wordString.toString();
    }
}
