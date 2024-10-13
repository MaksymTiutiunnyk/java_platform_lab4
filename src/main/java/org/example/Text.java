package org.example;

/**
 * Represents a text consisting of multiple sentences.
 */
public class Text {
    private final Sentence[] sentences;
    private int currentIndex = 0;

    /**
     * Constructor to initialize a Text object with a fixed number of sentences.
     *
     * @param size the number of sentences in the text
     */
    public Text(int size) {
        sentences = new Sentence[size];
    }

    /**
     * Constructor to initialize a Text from a string.
     * The string is split into sentences based on sentence-ending punctuation.
     *
     * @param text the string representing the text
     */
    public Text(String text) {
        String[] splitSentences = text.split("(?<=[.?!])");
        sentences = new Sentence[splitSentences.length];

        for (String sentence : splitSentences)
            addSentence(new Sentence(sentence.trim()));
    }

    /**
     * Adds a sentence to the text.
     *
     * @param sentence the sentence to add
     */
    public void addSentence(Sentence sentence) {
        if (currentIndex < sentences.length)
            sentences[currentIndex++] = sentence;
    }

    /**
     * Returns the sentences in the text.
     *
     * @return an array of sentences
     */
    public Sentence[] getSentences() {
        return sentences;
    }

    /**
     * Returns the string representation of the text.
     *
     * @return string representation of the text
     */
    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (Sentence sentence : sentences) {
            if (sentence != null)
                textString.append(sentence).append(" ");
        }
        return textString.toString().trim();
    }
}
