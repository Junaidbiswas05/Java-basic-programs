import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        int remainder;
        if (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
            
            if (reversedNumber == originalNumber) {
                System.out.println(originalNumber + " is a palindrome.");
            } else {
                System.out.println(originalNumber + " is not a palindrome.");
            }
        } else {
            System.out.println("The number is zero, a palindrome by default.");
        }
    }
}