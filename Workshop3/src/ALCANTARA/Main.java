package ALCANTARA;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum=s.nextInt();

        System.out.print("Enter second number: ");
        int secondNum=s.nextInt();

        int temporary = firstNum;
        firstNum=secondNum;
        secondNum = temporary;
        System.out.print('\n');
        System.out.println("Value of first number: "+firstNum);
        System.out.println("Value of Second number: "+secondNum);
    }
}
