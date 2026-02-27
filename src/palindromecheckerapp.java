import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            queue.add(c);  // Enqueue (FIFO)
            stack.push(c); // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare Dequeue (Original Order) vs Pop (Reverse Order)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}