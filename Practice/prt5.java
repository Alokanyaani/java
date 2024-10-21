//Write a Java program that takes two numbers as input and displays the product of two numbers.




package Practice;


import java.util.Scanner;

public class prt5 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("first num:");
        int A = sc.nextInt();


        System.out.println("second num:");
        int B =sc.nextInt(); 
        
        System.out.println("A+B-:" +( A*B));
    } 
    
}
