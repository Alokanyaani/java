// write a java program to add 2 numbers input by user.



import java.util.Scanner;


public class pr4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number");
        int a =sc.nextInt();


        System.out.println("Enter second number ");
        int b =sc.nextInt();


        int sum =a+b;
        System.out.println("sum of two number");
        System.out.println(sum);
    }

    
}
