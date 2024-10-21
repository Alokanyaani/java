import java.util.Scanner;



public class if_else {
    public static void main(String[] args){

        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age::");
        age = sc.nextInt();

        if(age<=13){
            System.out.println(" you are too kid. dont even think to come to my party::" );

        }
        else if(age<=15){
            System.out.println("You are new grown kid.. just think to come but dont allow to visit my party:");

        }
        else if (age<=18){
            System.out.println("You are teenagers. you can come but with pass and restrictions :");

        }
        else{
            System.out.println("you are programmers !! just come and fully enjoy my party::");

        }

        sc.close();

    }
    
}
