package org.example;

/**
 * Represents a sentence consisting of words and punctuation marks.
 */
public class Sentence {
    private final SentenceElement[] elements;
    private int currentIndex = 0;

    /**
     * Constructor to initialize a Sentence with a fixed number of elements.
     *
     * @param size the number of elements in the sentence
     */
    public Sentence(int size) {
        elements = new SentenceElement[size];
    }

    /**
     * Constructor to initialize a Sentence from a string.
     * The string is split into words and punctuation elements.
     *
     * @param sentence the string representing the sentence
     */
    public Sentence(String sentence) {
        elements = new SentenceElement[sentence.length()];
        StringBuilder currentWord = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c))
                currentWord.append(c);
            else if ((Character.isWhitespace(c) && !currentWord.isEmpty())) {
                addWord(new Word(currentWord.toString()));
                currentWord = new StringBuilder();
                addElement(new Punctuation(' '));
            } else {
                if (!currentWord.isEmpty()) {
                    addWord(new Word(currentWord.toString()));
                    currentWord = new StringBuilder();
                }
                addElement(new Punctuation(c));
            }
        }
    }

    /**
     * Adds a word to the sentence.
     *
     * @param word the word to add
     */
    public void addWord(Word word) {
        if (currentIndex < elements.length)
            elements[currentIndex++] = word;
    }

    /**
     * Adds a punctuation or other element to the sentence.
     *
     * @param element the sentence element to add
     */
    public void addElement(SentenceElement element) {
        if (currentIndex < elements.length)
            elements[currentIndex++] = element;
    }

    /**
     * Returns the elements of the sentence.
     *
     * @return an array of sentence elements
     */
    public SentenceElement[] getElements() {
        return elements;
    }

    /**
     * Returns the string representation of the sentence.
     *
     * @return string representation of the sentence
     */
    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (SentenceElement element : elements) {
            if (element != null)
                sentenceString.append(element);
        }
        return sentenceString.toString();
    }
}
