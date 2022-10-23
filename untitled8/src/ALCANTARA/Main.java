package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for number of minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int year = minutes / 525600; //to get the number of year we divided the minutes by 525600
        //525600 is the number of minutes in a year
        int remainingMinutes = minutes % 525600; // we get the remaining minutes using modulus
        int day = remainingMinutes / 1440; //to get the day we divide the remaining minutes by 1440
        //1440 is number of minutes in  a day

        System.out.println(minutes + " minutes is approximately " + year + " years & " + day + " days.");
    }
}
