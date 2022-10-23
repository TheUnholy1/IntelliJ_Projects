package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// ALCANTARA JASPHER B. FINALS PROJECT BSIT 1-1
        String letter;
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter Your Name:");
        String name = s.next();
        do {
            System.out.println("P M F");
            char term = s.next().charAt(0);
            System.out.println("DO You want to Choose P M F again?");
            letter = s.next();
            while (!letter.equalsIgnoreCase("yes")
                    && !letter.equalsIgnoreCase("no")) {
                System.out.println("Sorry, could you please say yes or no?");
                letter = s.next();
            }
        } while (letter.equalsIgnoreCase("yes"));
        System.out.printf("Have a great day %s!%n", name);
    }
}
