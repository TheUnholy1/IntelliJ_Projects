package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Student Personal Information");
        System.out.print("Semester: ");
        String sem = s.nextLine();
        System.out.print("Academic Year: ");
        String year = s.nextLine();
        System.out.print("Course/Section: ");
        String sec = s.nextLine();
        System.out.print("Student Number: ");
        long num = s.nextLong();
        s.nextLine();
        System.out.print("First Name: ");
        String first = s.nextLine();
        System.out.print("Middle Name: ");
        String mid = s.nextLine();
        System.out.print("Last Name: ");
        String last = s.nextLine();
        System.out.print("Age: ");
        int age = s.nextInt();
        s.nextLine();
        System.out.print("Birthday: ");
        String bday = s.nextLine();
        System.out.print("Mother's Name: ");
        String mother = s.nextLine();
        System.out.print("Father's Name: ");
        String father = s.nextLine();
        System.out.print("Address: ");
        String address = s.nextLine();
        System.out.print("Contact Number: ");
        long contact = s.nextLong();
        s.nextLine();
        System.out.print("Email Address: ");
        String email = s.nextLine();
        System.out.print("Contact Number of Parent/Guardian: ");
        long parent = s.nextLong();
        //output
        System.out.println("\nSTUDENT PERSONAL INFORMATION");
        System.out.print("Semester: "+sem); System.out.print("\t\t\t\t\t\t\t\t\t\t");
        System.out.println("Academic Year: "+year);
        System.out.println("Course/Section: "+sec);
        System.out.println("Student Number: "+num);
        System.out.print("First Name: "+first); System.out.print("\t\t\t\t\t\t\t\t\t\t");
        System.out.println("Middle Name: "+mid);
        System.out.println("Last Name: "+last);
        System.out.print("Age: "+age); System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t");
        System.out.println("Birthday: "+bday);
        System.out.print("Mother's Name: "+mother); System.out.print("\t\t\t\t\t\t\t\t\t");
        System.out.println("Father's Name: "+father);
        System.out.println("Address: "+address);
        System.out.println("Contact Number: "+contact);
        System.out.println("Email address: "+email);
        System.out.println("Contact number of Parent/Guardian: "+parent);

        s.close();

    }
}
