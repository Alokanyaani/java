//for ascii lower and uppercase code.



import java.util.Scanner;


public class pr5{

    public static void main(String[] args){

     // Create a Scanner object to read input  

       
     Scanner sc = new Scanner(System.in);
     
     // Prompt user to enter a grade character


     System.out.println(" Enter a grade character(A-F or a-f): ");

     char grade = sc.next().charAt(0);

     // check if the entered character is between 'A' to 'F' or 'a' to 'f'
     if ((grade >= 'A' && grade <= 'F')|| (grade >= 'a' && grade <= 'f')){
        
        // Display the grade

        System.out.println("You entered grade: " +  grade);

     } else {

        //Handle invalid input
        System.out.println("Invalid grade. Please enter a character between A-F or a-f.");

     }
     //close the scanner
     sc.close();
     }
    }

