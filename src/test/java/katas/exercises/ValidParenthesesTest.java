package katas.exercises;

import static katas.exercises.ValidParentheses.isValidParentheses;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    @Test
    public void testValidParentheses() {


        assertTrue(isValidParentheses("()"), "The parentheses should be valid");
        assertTrue(isValidParentheses("()[]{}"), "The parentheses should be valid");
        assertTrue(isValidParentheses("{[()]}"), "The parentheses should be valid");
        assertTrue(isValidParentheses("()()[]{}{}"), "The parentheses should be valid");
        assertFalse(isValidParentheses("(]"), "The parentheses should be invalid");
        assertFalse(isValidParentheses("([)]"), "The parentheses should be invalid");
        assertFalse(isValidParentheses("{[}"), "The parentheses should be invalid");
        assertFalse(isValidParentheses("[["), "The parentheses should be invalid");
        assertFalse(isValidParentheses("]["), "The parentheses should be invalid");
    }
}
