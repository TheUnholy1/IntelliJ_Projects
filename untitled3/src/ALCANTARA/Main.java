package ALCANTARA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("\n----------Sum and Difference of two numbers----------\n");
        System.out.print("Please Enter The First  Number: ");
        int firstNum=s.nextInt();
        System.out.print("Please Enter The Second Number: ");
        int secondNum=s.nextInt();
        System.out.print("\n");
        int sum = firstNum+secondNum;
        int diff = firstNum-secondNum;
        String total = String.format("The sum of %d and %d is: %d", firstNum, secondNum, sum);
        System.out.println(total);
        String difference = String.format("The difference of %d and %d is: %d", firstNum, secondNum, diff);
        System.out.println(difference);

        s.close();
    }
}
