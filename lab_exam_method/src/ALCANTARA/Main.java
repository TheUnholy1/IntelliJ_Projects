package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void sum(int a, int b){
        System.out.println("The sum  of "+a+" and "+b+" is "+ (a+b));
    }
    public static void diff(int a, int b){
        System.out.println("The difference of "+a+" and "+b+" is "+ (a-b));
    }
    public static void prod(int a, int b){
        System.out.println("The product of "+a+" and "+b+" is "+(a*b));
    }
    public static void quot(int a, int b){
        System.out.println("The quotient of "+a+" and "+b+" is "+(a/b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Please Enter Second Number: ");
        int num2 = sc.nextInt();

        Main obj = new Main ();
        obj.sum(num1,num2);
        obj.diff(num1,num2);
        obj.prod(num1,num2);
        obj.quot(num1,num2);



    }

}
