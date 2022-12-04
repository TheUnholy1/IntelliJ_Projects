package ALCANTARA;
import java.util.Scanner;
public class Main {
// Midterm Lab Exam ALCANTARA , ANONUEVO & DIAZ
    public static void main(String[] args) {
	    double fare = 7.50;
        double additional = 1.50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select the Type of Passenger \n " +
                "[1] Regular \n [2] Student \n [3] Senior Citizen \n [4] Disable");
        int type = sc.nextInt();
        System.out.println("Please Input the Distance travel in km");
        int travel = sc.nextInt();

        switch (type){
            case 1:
                for(int x = 4; x < travel;x++){
                    fare += additional;

                }
                System.out.println("You've chosen Regular type passenger ");
                System.out.println("Your fare is Php "+fare);
                break;
            case 2:
                for(int i = 4; i < travel; i++){
                    fare += additional;
                }
                double student = fare*.20;
                double Fare = fare - student;
                System.out.println("You've chosen Student type passenger ");
                System.out.println("Your fare is Php "+Fare);
                break;

            case 3:
                for(int k = 4; k < travel; k++){
                    fare += additional;
                }
                double Senior = fare*.25;
                double FAre = fare - Senior;
                System.out.println("You've chosen Senior Citizen type passenger ");
                System.out.println("Your fare is Php "+FAre);
                break;
            case 4:
                for(int y = 4; y < travel; y++)
                    fare += additional;

                double Disable = fare*.30;
                double FARE = fare - Disable;
                System.out.println("You've chosen Disable type passenger ");
                System.out.println("Your fare is Php "+FARE);
                break;
        }

    }
}
