package io.github.dbc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseStringsGeneratorTest {

    private ReverseStringsGenerator reverseStringsGenerator;

    @BeforeEach
    void setUp() {
        reverseStringsGenerator = new ReverseStringsGenerator();
    }

    @AfterEach
    void tearDown() {
        reverseStringsGenerator = null;
    }

    @ParameterizedTest(name = "reverseWords({arguments})")
    @DisplayName("should throw a NullPointerException when null is passed as the string")
    @NullSource
    void shouldThrowANullPointerExceptionWhenNullIsPassed(String input) {
        assertThrows(NullPointerException.class, () -> reverseStringsGenerator.reverseWords(input));
    }

    @ParameterizedTest(name = "reverseWords({arguments})")
    @DisplayName("should throw an IllegalArgumentException when an empty string is passed as the string")
    @ValueSource(strings = {"", " ", "  ", "\t", "\n", "\r", "\n\r", "\r\n", "\n\r\n"})
    void shouldThrowAnIllegalArgumentExceptionWhenAnEmptyStringIsPassed(String input) {
        assertThrows(IllegalArgumentException.class, () -> reverseStringsGenerator.reverseWords(input));
    }

    @Test
    @DisplayName("should reverse the letters of each word in the given string")
    void shouldReverseTheLettersOfEachWordInHelloWorld() {
        String input = "Hello world!";
        String expected = "olleH !dlrow";
        String actual = reverseStringsGenerator.reverseWords(input);
        assertEquals(expected, actual, "The letters of each word in the given string should be reversed.");
    }

    @Test
    @DisplayName("should reverse the letters of each word in the given string")
    void shouldReverseTheLettersOfEachWordInTheGivenString() {
        String input = "Talk is cheap, show me the code!";
        String expected = "klaT si ,paehc wohs em eht !edoc";
        String actual = reverseStringsGenerator.reverseWords(input);
        assertEquals(expected, actual, "The letters of each word in the given string should be reversed.");
    }

    @ParameterizedTest(name = "reverse({arguments})")
    @DisplayName("should throw a NullPointerException when null is passed as the string")
    @NullSource
    void shouldThrowANullPointerExceptionWhenNullIsPassedAsTheString(String input) {
        assertThrows(NullPointerException.class, () -> reverseStringsGenerator.reverse(input));
    }

    @ParameterizedTest(name = "reverse({arguments})")
    @DisplayName("should throw an IllegalArgumentException when an empty string is passed as the string")
    @ValueSource(strings = {"", " ", "  ", "\t", "\n", "\r", "\n\r", "\r\n", "\n\r\n"})
    void shouldThrowAnIllegalArgumentExceptionWhenAnEmptyStringIsPassedAsTheString(String input) {
        assertThrows(IllegalArgumentException.class, () -> reverseStringsGenerator.reverse(input));
    }

    @Test
    @DisplayName("should reverse the order of the characters in a string")
    void shouldReverseTheOrderOfTheCharactersInHelloWorld() {
        String input = "Hello world!";
        String expected = "!dlrow olleH";
        String actual = reverseStringsGenerator.reverse(input);
        assertEquals(expected, actual, "The order of the characters in the given string should be reversed.");
    }

    @Test
    @DisplayName("should reverse the order of the characters in a string")
    void shouldReverseTheOrderOfTheCharactersInTheGivenString() {
        String input = "Talk is cheap, show me the code!";
        String expected = "!edoc eht em wohs ,paehc si klaT";
        String actual = reverseStringsGenerator.reverse(input);
        assertEquals(expected, actual, "The order of the characters in the given string should be reversed.");
    }
}