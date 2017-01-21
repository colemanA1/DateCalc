/**
 * Created by Coleman on 1/21/17.
 */
import java.util.Scanner;

public class DateCalc {
    public static void main(String[] args){

        System.out.println("Date Calculator");
        System.out.println("Enter all information in numerical format");


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
        


    }
}
