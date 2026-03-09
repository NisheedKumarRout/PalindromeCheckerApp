public class PalindromeCheckerApp {

    // UC10: Case-Insensitive & Space-Ignored Palindrome
    public static boolean isPalindromeIgnoreCaseSpace(String str) {

        // Normalize string: remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        // Check palindrome
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        if (isPalindromeIgnoreCaseSpace(input)) {
            System.out.println("Palindrome (ignoring case and spaces)");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}