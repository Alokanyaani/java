//Write a program to reverse a 3-digit number. 
//E.g.- Number :123     Output : 231


public class pr2 {
    public static void main(String[] args) {
        int n, first, second, third, reverse;
        n = 987;
        first =n/100; // first digit 
        n = n%100;
        second = n/10;// second digit
        third = n%10;//third digit
        /* reverse the number */
        reverse =third *100 +second *10 + first;

        System.out.println("REVERSE NUMBER:: "+ reverse);
      
    }
}
