package ALCANTARA;

import java.util.Scanner;

public class Jaspher {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = s.nextLine();
        System.out.print("Your name is "+name);

        s.close();

    }
}
