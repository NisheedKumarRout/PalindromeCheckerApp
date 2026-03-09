public class PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean checkUsingLoop(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Recursive approach
    public static boolean checkUsingRecursion(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return checkUsingRecursion(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        // Measure loop method
        long startTime1 = System.nanoTime();
        boolean result1 = checkUsingLoop(input);
        long endTime1 = System.nanoTime();

        // Measure recursion method
        long startTime2 = System.nanoTime();
        boolean result2 = checkUsingRecursion(input, 0, input.length() - 1);
        long endTime2 = System.nanoTime();

        System.out.println("Loop Method Result: " + result1);
        System.out.println("Loop Execution Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("Recursion Method Result: " + result2);
        System.out.println("Recursion Execution Time: " + (endTime2 - startTime2) + " ns");
    }
}