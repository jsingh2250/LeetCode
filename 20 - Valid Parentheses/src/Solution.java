import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Convert the string into a char array for easy access to characters.
        char[] parentheses = s.toCharArray();

        // Store the opening parentheses in a stack as they're analyzed.
        Stack<Character> seenOpeningParentheses = new Stack<>();

        // Check whether the order and number of parentheses in the char array is valid.
        for (int i = 0; i < parentheses.length; i++) {
            // If the parenthese being checked is an opening parenthese, push it on the stack. If the parenthese is a closing parenthese and the stack is not empty, check whether it matches the type of parenthese on the top of the stack. Pop the opening parenthese off the stack if the closing parenthese is the right type. Return false if the closing parenthese is the wrong type.
            switch (parentheses[i]) {
                case '(':
                case '[':
                case '{':
                    seenOpeningParentheses.push(parentheses[i]);
                    break;
                default:
                    if ((!seenOpeningParentheses.empty()) && ((seenOpeningParentheses.peek() == (parentheses[i] - 1))
                            || (seenOpeningParentheses.peek() == (parentheses[i] - 2)))) {
                        seenOpeningParentheses.pop();
                    } else {
                        return false;
                    }
            }
        }

        // Return true if the stack is empty. Return false otherwise. This represents whether the parentheses in the specified string are valid.
        return seenOpeningParentheses.empty();
    }
}