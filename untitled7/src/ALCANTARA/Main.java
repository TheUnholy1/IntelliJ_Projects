package ALCANTARA;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Input Number of minutes: ");
        int min = s.nextInt(); // min has the input number of minutes

        double  years = (double) (min/525600)%365; //525600 is minutes in a year //I converted it to a compatible variable type
        /* to get the value of years we divided the inputted number of minutes by 525600 */
        float days = (float) (min/1440)%365; //1440 is minutes in a year    //I converted it to a compatible variable type
        // to get number of days we divided the inputted minutes by 1440 to get the number of days

        System.out.println(min + " minutes is approximately " + years + " years & " + days + " days");

    }
}
