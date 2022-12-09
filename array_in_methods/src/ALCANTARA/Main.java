package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void Welcome (String name){
        System.out.println("Welcome "+name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();

        Main obj = new Main ();
        obj.Welcome(name);

    }
}
