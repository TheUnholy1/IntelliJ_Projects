package ALCANTARA;

import java.util.Scanner;
public class TestOperation {
    public static void main(String[] args) {
        Operation a = new Operation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        a.setNum1(num1);
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        a.setNum2(num2);
        System.out.println("Choose Operator : \n\t 1 - Addition \n\t 2 - Subtraction \n\t 3 - Multiplication \n\t 4 - Division");
        System.out.print("Select Operator : ");
        int oper = sc.nextInt();
        a.setOper(oper);
        a.Oper();
        System.out.println("Answer : " + a.getAnswer());
    }
}
