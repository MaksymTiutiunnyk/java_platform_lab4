package org.example;

public class Word implements SentenceElement {
    private final Letter[] letters;

    public Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++)
            letters[i] = new Letter(word.charAt(i));
    }

    public int countVowels(char[] vowels) {
        int count = 0;
        for (Letter letter : letters) {
            if (letter.isVowel(vowels))
                count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : letters)
            wordString.append(letter);

        return wordString.toString();
    }
}

