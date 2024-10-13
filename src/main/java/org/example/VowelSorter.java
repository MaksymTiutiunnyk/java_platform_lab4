package org.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * The {@code VowelSorter} class provides functionality to sort the words in each sentence of a text
 * based on the number of vowels in each word.
 */
public class VowelSorter {
    /**
     * Sorts the words in each sentence of a given {@code Text} object by the number of vowels in each word.
     * Non-word elements such as punctuation remain in their original positions.
     *
     * @param text   the {@code Text} object containing sentences to be sorted
     * @param vowels an array of characters representing vowels to be used for counting
     * @return a new {@code Text} object with words sorted by the number of vowels
     */
    public static Text sortWordsByVowels(Text text, char[] vowels) {
        Text sortedText = new Text(text.getSentences().length);

        for (Sentence sentence : text.getSentences()) {
            SentenceElement[] elements = sentence.getElements();
            Word[] words = new Word[elements.length];
            SentenceElement[] sortedElements = new SentenceElement[elements.length];

            int wordCount = 0;
            for (SentenceElement element : elements) {
                if (element instanceof Word)
                    words[wordCount++] = (Word) element;
            }

            Word[] actualWords = new Word[wordCount];
            System.arraycopy(words, 0, actualWords, 0, wordCount);
            Arrays.sort(actualWords, Comparator.comparingInt(word -> word.countVowels(vowels)));

            int wordIndex = 0;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] instanceof Word)
                    sortedElements[i] = actualWords[wordIndex++];
                else
                    sortedElements[i] = elements[i];
            }

            Sentence sortedSentence = new Sentence(elements.length);
            for (SentenceElement element : sortedElements) {
                if (element instanceof Word)
                    sortedSentence.addWord((Word) element);
                else
                    sortedSentence.addElement(element);
            }
            sortedText.addSentence(sortedSentence);
        }

        return sortedText;
    }
}
