package org.example;

public class Text {
    private final Sentence[] sentences;
    private int currentIndex = 0;

    public Text(int size) {
        sentences = new Sentence[size];
    }

    public Text(String text) {
        String[] splitSentences = text.split("(?<=[.?!])");
        sentences = new Sentence[splitSentences.length];

        for (String sentence : splitSentences)
            addSentence(new Sentence(sentence.trim()));
    }

    public void addSentence(Sentence sentence) {
        if (currentIndex < sentences.length)
            sentences[currentIndex++] = sentence;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

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
