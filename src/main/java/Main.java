public class Main {

    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder output = new StringBuilder(input).reverse();
        return output.toString();
    }
  
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println(reversed);  // Outputs: olleH
    }
}