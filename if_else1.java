// code for marksheet


import java.util.Scanner;


public class if_else1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  name:-");
        String name = 
        sc.nextLine();

        System.out.println("Roll Number:-");
        int RollNumber = sc.nextInt();


        //Input marks for five subjects
        System.out.println("Enter marks for Maths:-");
        int MathsMarks = sc.nextInt();


        System.out.println("Enter marks for Beee:-");
        int BeeeMarks = sc.nextInt();

        System.out.println("Enter marks for Chemistry:-");
        int ChemistryMarks = sc.nextInt();

        System.out.println("Enter marks for Ed:-");
        int EdMarks = sc.nextInt();

        System.out.println("Enter marks for English:-");
        int EnglishMarks = sc.nextInt();
        
        sc.close();
        

        //Calculate total marks 
        int TotalMarks = MathsMarks + BeeeMarks + ChemistryMarks + EdMarks + EnglishMarks;
        System.out.println("Total Marks:-");
        System.out.println(TotalMarks);
         
        

        //Calculate the percentage
        double percentage = TotalMarks /5;
        // Check if the student passed or failed
       if  ( percentage <=100 &&   MathsMarks >=23   &&   BeeeMarks >=23 && ChemistryMarks >=23 && EdMarks >= 23 &&  EnglishMarks >=23 ){
             System.out.println("Congratulation! You have passed");
             
        }
         else if( MathsMarks <23 ){
           System.out.println("fail in Maths ");

       }
    
          if (BeeeMarks <23) {
            System.out.println("Fail in Beee");
        }
         if ( ChemistryMarks <23){
            System.out.println("Fail in Chemistry");
        }
         if (EdMarks <23){
            System.out.println("Fail in Ed");
        }
         if (EnglishMarks <23){
            System.out.println("Fail in English");
        }
         // Display the percentage
         System.out.println("Your percentage:"+percentage +"%");
        
   }  

}   
      

   

   

   

   


    

