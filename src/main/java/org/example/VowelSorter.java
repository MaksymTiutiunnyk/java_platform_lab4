package org.example;

import java.util.Comparator;

public class VowelSorter {
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
            Comparator<Word> vowelComparator = Comparator.comparingInt(word -> word.countVowels(vowels));
            sort(actualWords, vowelComparator);

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

    // Метод для сортування масиву
    private static <T> void sort(T[] array, Comparator<? super T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[i], array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
