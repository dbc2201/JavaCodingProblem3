package io.github.dbc;

public class ReverseStringsGenerator {
    /**
     * This method will reverse the letters of each word in the given string.
     *
     * @param string the string to reverse.
     * @return the reversed string with the letters of each word reversed.
     * @throws NullPointerException     if the given string is null.
     * @throws IllegalArgumentException if the given string is empty.
     */
    public String reverseWords(String string) {
        if (string == null) {
            throw new NullPointerException("The given string cannot be null.");
        }
        if (string.isEmpty() || string.isBlank()) {
            throw new IllegalArgumentException("The given string cannot be empty.");
        }
        String[] words = string.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();

            for (int length = word.length(); length > 0; length--) {
                reversedWord.append(word.charAt(length - 1));
            }

            reversedString.append(reversedWord).append(" ");
        }
        return reversedString.toString().trim();
    }

    /**
     * This method reverses the order of the characters in a string.
     * It also reverses the order of the words in the string.
     *
     * @param string the string to reverse.
     * @return the reversed string with the letters of each word reversed and the words in reverse order.
     * @throws NullPointerException     if the given string is null.
     * @throws IllegalArgumentException if the given string is empty.
     */
    public String reverse(String string) {
        return String.valueOf(Integer.MIN_VALUE);
    }
}
