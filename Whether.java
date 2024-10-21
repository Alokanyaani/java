/*Write a java program to get a number from the user and print whether it is positive or negative.

Test Data 
Input number:35
Expected Output:
Number is positve
*/


import java.util.Scanner;

public class Whether {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int Input = sc.nextInt();

        if (Input >0){
            System.out.println("Number is positive");
                     
        } 
        else if (Input <0){
            System.out.println("number is negative");

        }else {
            System.err.println("Number is zero");
        }


    }
    
}
