public class Main {

    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder output = new StringBuilder(input).reverse();
        return output.toString();
    }

    public static boolean isPalindrome(String input) {
        if(input == null){
            throw new IllegalArgumentException("Input string can't be null");
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }
  
    public static void main(String[] args) {
        String inputReverseString = "Hello";
        String reversed = reverseString(inputReverseString);
        System.out.println(reversed);  // Outputs: olleH

        String inputPalindrome = "anna";
        Boolean isPalindrome = isPalindrome(inputPalindrome);
        System.out.println(isPalindrome);  // Outputs: true
    }
}