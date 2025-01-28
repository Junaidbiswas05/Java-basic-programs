
import java.util.Scanner;

public class ASCAII {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any value:");
        Character ch= sc.nextLine().charAt(0);
        System.out.println((int)ch);
    }
}
