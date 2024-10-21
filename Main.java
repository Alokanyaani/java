//Write a java program to check wheather a number entered by the user is integer or not.



import java.util.Scanner;

public class Main {
  public static void main (String[] args)	
{
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int number = scanner.nextInt();
	 
	 if (number % 1 ==0) {
		 System.out.println(number +"is an integer.");
	 }else {
		 System.out.println(number +"is not an integer.");
		 
	 }
	 scanner.close();
  }
}
