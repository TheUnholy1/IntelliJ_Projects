package ALCANTARA;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name =s.nextLine();

            System.out.print("Enter your age: ");
            int age =s.nextInt();

            s.nextLine();

            System.out.print("Enter your gender: ");
            String gender =s.nextLine();

            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Gender: "+gender);

            s.close();
    }
}
