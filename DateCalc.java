/**
 * Created by Coleman on 1/21/17.
 */
import java.util.Scanner;

public class DateCalc {
    public static void main(String[] args){

        System.out.println("Date Calculator");
        System.out.println("Enter All Information in Numerical Format");


        //User Input for Years
        Scanner Y1 = new Scanner(System.in);
        System.out.println("Enter Latest Year First: ");
        int y1 = Y1.nextInt();
        //User input for Earlier Year
        Scanner Y2 = new Scanner(System.in);
        System.out.println("Enter Earlier Year Next: ");
        int y2 = Y2.nextInt();

        //User Input for Months
        Scanner M1 = new Scanner(System.in);
        System.out.println("Enter Latest Month First: ");
        int m1 = M1.nextInt();
        //User input for Earlier Month
        Scanner M2 = new Scanner(System.in);
        System.out.println("Enter Earlier Month Next: ");
        int m2 = M2.nextInt();

        //User Input for Days
        Scanner D1 = new Scanner(System.in);
        System.out.println("Enter Latest Day First: ");
        int d1 = D1.nextInt();
        //User input for Earlier Day
        Scanner D2 = new Scanner(System.in);
        System.out.println("Enter Earlier Day Next: ");
        int d2 = D2.nextInt();


        //Calculate Years
        int years = y1 - y2; //Still need to add leap years
        int leap = years % 4;//Adds days of leap years to final answer
        int leapDay = y2 %4;//Helps find if month of February is a leap year for the day calculation.

        //Calculate Months
        int months = (12 - m2) + m1;

        //Calculate Days
        // Calculates  if the month is 28, 29, 30, or 31 days
        if(m2 == 4) {
            d2 = (30 - d2);
        }
        else if (m2 == 6) {
            d2 = (30 - d2);
        }
        else if (m2 == 9) {
            d2 = (30 - d2);
        }
        else if (m2 == 11) {
            d2 = (30 - d2);
        }
        else if (leapDay / 4 == 1 && m2 == 2) {
            d2 = (29 - d2);
        }
        else if (leapDay / 4 != 1) {
            d2 = (28 - d2);
        }
        else {
            d2 = (31 - d2);
        }
        
    }

}
