package io.github.dbc;

public class Main {
    public static void main(String[] args) {
        ReverseStringsGenerator reverseStringsGenerator = new ReverseStringsGenerator();
        String reverseWords = reverseStringsGenerator.reverseWords("Talk is cheap, show me the code!");
        System.out.println(reverseWords);
    }
}