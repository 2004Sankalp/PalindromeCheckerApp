public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";
        String reversed = "";

        for (int i = input.length()-1; i >=0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println("Palindrome? " + input.equals(reversed));
    }
}