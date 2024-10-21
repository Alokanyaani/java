// Write a java program to encrupt a grade by adding 8 to it.Decrupt it to show the currect grade.


public class pr6 {
    public static void main(String[] args) {
        char grade ='B';


        //Encrupt a grade

        char encrupt_grade =(char)('B' +8);
        System.out.println("Encrupt grade: " + encrupt_grade);

        
        char decrypt_grade = (char) (encrupt_grade - 8);
        System.out.println("Decrupt grade:" +decrypt_grade);


        
    }
    
}
