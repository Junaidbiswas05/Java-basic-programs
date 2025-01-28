

public class ReverseString {
    public static void reverseString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }

    public static void main(String[] args) {
        String input = "hello";
        reverseString(input);
    }
}