package org.example;

public class Sentence {
    private final SentenceElement[] elements;
    private int currentIndex = 0;

    public Sentence(int size) {
        elements = new SentenceElement[size];
    }

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

    public void addWord(Word word) {
        if (currentIndex < elements.length)
            elements[currentIndex++] = word;
    }

    public void addElement(SentenceElement element) {
        if (currentIndex < elements.length)
            elements[currentIndex++] = element;
    }

    public SentenceElement[] getElements() {
        return elements;
    }

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
