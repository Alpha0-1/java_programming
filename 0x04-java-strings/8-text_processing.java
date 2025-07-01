/**
 * Demonstrates advanced text processing in Java.
 */
public class TextProcessing {

    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        
        // Example: Replacing all occurrences of a substring
        String replacedText = text.replace("fox", "cat");
        System.out.println("Original Text: " + text);
        System.out.println("Replaced Text: " + replacedText);
        
        // Example: Counting word occurrences
        String[] words = text.split(" ");
        java.util.HashMap<String, Integer> wordCount = new java.util.HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("\nWord counts: " + wordCount);
        
        // Example: Finding the longest word
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
        
        // Example: Reversing words in a sentence
        String reversedSentence = new StringBuilder(text).reverse().toString();
        System.out.println("\nReversed sentence: " + reversedSentence);
        
        // Example: Capitalizing each word
        String capitalized = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        capitalized = capitalized.trim();
        System.out.println("Capitalized sentence: " + capitalized);
    }
}
