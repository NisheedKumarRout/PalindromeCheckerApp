public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // Example: choose Stack strategy
        strategy = new StackStrategy();

        boolean result = strategy.checkPalindrome(input);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}