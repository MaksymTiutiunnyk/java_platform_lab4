package org.example;

public class Main {
    private static final String TEXT = "This line is a first sentence. This one is a second one. Wow! Which word has the most vowels in each sentence?";
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public static void main(String[] args) {
        Text text = new Text(TEXT);

        System.out.println("Initial text: " + text);

        Text sortedText = VowelSorter.sortWordsByVowels(text, VOWELS);

        System.out.println("Sorted text: " + sortedText);
    }
}

