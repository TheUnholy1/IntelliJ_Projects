package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        float fare = 7.50f;
        float added = 1.50f;
        System.out.println("Select the Type of Passenger \n[1] Regular \n[2] Student \n[3] Senior Citizen \n[4] Disable");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value == 1){
            System.out.println("Input the distance travel in km");
            int distance = sc.nextInt();
            for(int x = 4; x < distance;x++){
                fare += added;

            }
            System.out.println("You've chosen Regular type passenger ");
            System.out.println("Your fare is Php "+fare);
        }
        else if(value == 2){
            System.out.println("Input the distance travel in km");
            int distance = sc.nextInt();
            for(int i = 4; i < distance; i++){
                fare += added;
            }
            double student = fare*.20;
            double Fare = fare - student;
            System.out.println("You've chosen Student type passenger ");
            System.out.println("Your fare is Php "+Fare);

        }
        else if(value == 3){
            System.out.println("Input the distance travel in km");
            int distance = sc.nextInt();
            for(int k = 4; k < distance; k++){
                fare += added;
            }
            double Senior = fare*.25;
            double FAre = fare - Senior;
            System.out.println("You've chosen Senior Citizen type passenger ");
            System.out.println("Your fare is Php "+FAre);
        }
        else if(value == 4){
            System.out.println("Input the distance travel in km");
            int distance = sc.nextInt();
            for(int y = 4; y < distance; y++)
                fare += added;

            double Disable = fare*.30;
            double FARE = fare - Disable;
            System.out.println("You've chosen Disable type passenger ");
            System.out.println("Your fare is Php "+FARE);


        }
    }
}

