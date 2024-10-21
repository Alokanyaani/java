// write a program that takes a input by the user and check if it is buzz number or not.


import java.util.Scanner;


public class buzz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        //Read the user's input as an integer
        int num = sc.nextInt();

        //close the scanner
        sc.close();

        //Check if the number is divisible by 7 or ends with 7
        if (num % 7 ==0|| num % 10 ==7){

            System.out.println(num +"is a buzz number");
            
 } else{
            System.out.println(num +" is not a buzz number");

 }



        
    }
    
}
