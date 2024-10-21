//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.





package Practice;

import java.util.Scanner;


public class prt6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("first num");
        int A = sc.nextInt();

        System.out.println("second num");
        int B = sc.nextInt();

        System.out.println("Add:-" + (A+B) );
        System.out.println("Sub:-" + (A-B));
        System.out.println("Multiply:-" + (A*B));
        System.out.println("Divide:-" + (A/B));
        System.out.println("Remainder:-" + (A%B));


    }
    
}
