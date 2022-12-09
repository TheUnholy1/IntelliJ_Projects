package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void name (String a, String b){
        System.out.println("Welcome "+a+" "+b);
    }
    public static void id (int a){
        System.out.println("Your Student ID is "+a);
    }
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your First Name: ");
        String f_name = sc.nextLine();
        System.out.print("Please Enter Your Last Name: ");
        String l_name = sc.nextLine();
        System.out.print("Please Enter Your Student ID: ");
        int ID = sc.nextInt();
        Main obj = new Main();
        obj.name(f_name, l_name);
        obj.id(ID);
    }
}
