/*Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
*/

import java.util.Scanner;

public class calendar{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int number_of_DayslnMonth = 0;
        String MonthOfName ="Unknown";

        System.out.print("Input a month number.");
        int month = sc.nextInt();

        System.out.print("Input a year.");
        int year = sc.nextInt();

        switch (month){
            case 1:
            MonthOfName ="January";
            int  number_Of_DayslnMonth =31;
            break;

            case 2:
            MonthOfName ="February";
            if ((year %400 == 0) || ((year % 4 == 0) &&(year % 100!= 0))){
                number_Of_DayslnMonth =29;

            }else{
                number_Of_DayslnMonth =28;
            }
            break;

            case 3:
            MonthOfName ="March";
            number_Of_DayslnMonth = 31;
            break;

            case 4:
            MonthOfName ="April";
            number_Of_DayslnMonth =30;
            break;

            case 5:
            MonthOfName ="May";
            number_Of_DayslnMonth =31;

            case 6:
            MonthOfName ="June";
            number_Of_DayslnMonth = 30;
            break;

            case 7:
            MonthOfName ="July";
            number_Of_DayslnMonth =31;
            break;

            case 8:
            MonthOfName = "August";
            number_Of_DayslnMonth =31;
            break;

            case 9:
            MonthOfName ="September";
            number_Of_DayslnMonth =30;
            break;

            case 10:
            MonthOfName ="October";
            number_Of_DayslnMonth =31;
            break;

            case 11:
            MonthOfName ="November";
            number_Of_DayslnMonth =30;
            break;

            case 12:
            MonthOfName ="December";
            number_Of_DayslnMonth =31;
            break;
       }
       System.out.println(MonthOfName + "" + year + "has" + number_of_DayslnMonth + "days\n");
    }
}