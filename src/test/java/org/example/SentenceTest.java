package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceTest {
    @Test
    void testSentenceConstructor() {
        Sentence sentence = new Sentence("Hello, world!");
        assertEquals("Hello, world!", sentence.toString());
    }

    @Test
    void testAddWordAndElements() {
        Sentence sentence = new Sentence(2);
        Word word = new Word("example");
        sentence.addWord(word);
        sentence.addElement(new Punctuation('.'));
        assertEquals("example.", sentence.toString());
    }
}
