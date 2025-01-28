
import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       String a ="+,-,*,/";
        String b=">,<=,>,>=";
        String c="&&,||,!";
        System.out.println("choose the option (A/B/C)");
        String d = sc.nextLine();
        if(d.equals("A")){
            System.out.println("Arithmetic operators:" +a);
        }else if (d.equals("B")) {
            System.out.println("Relational Operator:"+b);
            
        }else{
            System.out.println("Logical oparators"+c);
        }
        }
        
    }