package ALCANTARA;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.print("Input number of minutes: ");
    int min = s.nextInt(); // value of input number of minutes

    double years = (min / 525600)%365; // 525600 is number of minutes in a year
    float days =(float) (min / 1440)%365; // 1440 is number of minutes in  a day
        System.out.println(years + " " +days);
    }
}
