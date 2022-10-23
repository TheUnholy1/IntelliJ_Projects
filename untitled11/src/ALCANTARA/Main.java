package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your ID: ");
        int id = s.nextInt();
        switch (id){
            case 500:
                System.out.print("Enter Your Password: ");
                int passwords = s.nextInt();
        switch (passwords){
            case 000:
                System.out.print("Welcome Dear Programmer!!!");
                break;
        default:
            System.out.print("Incorrect Password");
            break;
        }
        break;
            default:
                System.out.println("Incorrect ID");
                break;
        }
    }
}
