package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WordTest {
    @Test
    void testCountVowels() {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Word word = new Word("hello");
        assertEquals(2, word.countVowels(vowels));
    }
}
