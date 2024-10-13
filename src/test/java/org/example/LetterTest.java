package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LetterTest {
    @Test
    void testGetCharacter() {
        Letter letter = new Letter('a');
        assertEquals('a', letter.getCharacter());
    }

    @Test
    void testIsVowel() {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Letter vowelLetter = new Letter('a');
        Letter consonantLetter = new Letter('b');
        assertTrue(vowelLetter.isVowel(vowels));
        assertFalse(consonantLetter.isVowel(vowels));
    }
}
