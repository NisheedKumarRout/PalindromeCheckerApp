public class PalindromeCheckerApp {

    // UC9: Recursive Palindrome Checker
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        if (isPalindromeRecursive(input, 0, input.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}