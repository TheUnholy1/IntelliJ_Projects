package ALCANTARA;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Jaspher B. Alcantara BSIT 2-1

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter Your BirthYear: ");
        int year = sc.nextInt();

        String msg = "Your Zodiac Sign is Year of The ";

        switch (year % 12){
            case 0:
                System.out.println(msg+"Monkey");

                break;

            case 1:
                System.out.println(msg+"Rooster");
                break;

            case 2:
                System.out.println(msg+"Dog");
                break;
            case 3:
                System.out.println(msg+"Pig");
                break;
            case 4:
                System.out.println(msg+"Rat");
                break;
            case 5:
                System.out.println(msg+"Ox");
                break;
            case 6:
                System.out.println(msg+"Tiger");
                break;
            case 7:
                System.out.println(msg+"Rabbit");
                break;
            case 8:
                System.out.println(msg+"Dragon");
                break;
            case 9:
                System.out.println(msg+"Snake");
                break;
            case 10:
                System.out.println(msg+"Horse");
                break;
            case 11:
                System.out.println(msg+"Sheep");
                break;

        }

    }
}
