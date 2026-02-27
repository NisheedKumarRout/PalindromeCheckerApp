import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "madam";
        Stack<Character> stack = new Stack<>();

        // Push all characters onto the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        String reversed = "";
        // Pop characters to build the reversed string
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}