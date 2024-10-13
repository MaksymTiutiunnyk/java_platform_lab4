package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextTest {
    @Test
    void testTextConstructor() {
        Text text = new Text("This is a test. Hello!");
        assertEquals("This is a test. Hello!", text.toString());
    }

    @Test
    void testAddSentence() {
        Text text = new Text(1);
        Sentence sentence = new Sentence("Test sentence.");
        text.addSentence(sentence);
        assertEquals("Test sentence.", text.toString());
    }
}

