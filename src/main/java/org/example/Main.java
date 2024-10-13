package org.example;

/**
 * Main class to demonstrate the sorting of words in a text based on the number of vowels.
 * It initializes a predefined text, sorts the words by the number of vowels in each sentence,
 * and prints the original and sorted text.
 */
public class Main {
    private static final String TEXT = "This line, is a first sentence. This one - is a second one. Wow! Which word has the most vowels in each sentence?";
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    /**
     * Main method that initializes the text, sorts it by vowel count, and prints the result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Text text = new Text(TEXT);

        System.out.println("Initial text: " + text);

        Text sortedText = VowelSorter.sortWordsByVowels(text, VOWELS);

        System.out.println("Sorted text: " + sortedText);
    }
}
