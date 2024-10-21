//Write a program to calculate the sum of the digits of a 3-digit number .Number :123 Output :6 ?



 public class pr1 {
    public static void main(String[] args) {
        int num = 132;
        int sum =0;
         
        while (num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;

        }
        System.out.println("Sum of digits:" +sum);
    }
}
