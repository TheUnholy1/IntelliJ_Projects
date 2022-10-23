package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Jaspher B Alcantara BSIT 1-1 Workshop 9
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A Character: ");

        char let = s.next().charAt(0);

        String consonantOrvowel = (let == 'a' || let == 'e' ||
                let == 'i' || let == 'o' || let == 'u'|| let == 'A' ||
                let == 'E' || let == 'I' || let == 'O' || let == 'U')
                ? "Vowel" : "Consonant";

        s.nextLine();
        System.out.print("Enter A Number: ");

        int num = s.nextInt();

        String evenOrodd = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("Character  is " + consonantOrvowel);
        System.out.println("Number is " + evenOrodd);
    }
}
