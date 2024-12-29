package katas.exercises;

import java.util.Stack;

public class ValidParentheses {

    /**
     * Checks if a given string has valid parentheses (try in O(n)).
     *
     * A string has valid parentheses if:
     * 1. Every opening parenthesis has a matching closing parenthesis.
     * 2. The parentheses are correctly nested.
     *
     * @param s the input string containing parentheses
     * @return true if the string has valid parentheses, false otherwise
     */
    public static boolean isValidParentheses(String s) {
        // Hint for efficient implementation: stack
        Stack<Character> stack = new Stack<>();
        char popped;

        for (char c : s.toCharArray()) {
          //  System.out.println(c);
           if (c == '(' || c == '[' || c == '{') {
             stack.push(c);
         }

           else if (c == ')' || c == ']' || c == '}') {
               if (stack.isEmpty()) {
                   return false;
               }

                popped = stack.pop();

               if (!((popped == '(' && c == ')') ||(popped == '[' && c == ']') || (popped == '{' && c == '}'))) {
                   return false;
               }
           }
        }


        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String validInput = "()[]{}";
        String invalidInput1 = "(]";
        String invalidInput2 = "([)]";
        String validInputNested = "{[()]}";

        System.out.println("Is valid: " + isValidParentheses(validInput));
        System.out.println("Is valid: " + isValidParentheses(invalidInput1));
        System.out.println("Is valid: " + isValidParentheses(invalidInput2));
        System.out.println("Is valid: " + isValidParentheses(validInputNested));
    }
}
