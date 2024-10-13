package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelSorterTest {
    @Test
    void testSortWordsByVowels() {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Text text = new Text("This is a simple test. Hello world!");
        Text sortedText = VowelSorter.sortWordsByVowels(text, vowels);
        assertEquals("This is a test simple. world Hello!", sortedText.toString());
    }
}
