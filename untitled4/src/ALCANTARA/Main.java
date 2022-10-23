package ALCANTARA;

public class Main {

    public static void main(String[] args) {


        int bitwise1 = 45 , bitwise2 = 10;
        int num = 15;
        int logical1 = 10 , logical2 = 10 , logical3 = 5;
        int arithmetic1 = 10 , arithmetic2 = 15;
        int result_and = bitwise1 & bitwise2 , result_or = bitwise1 | bitwise2;
        int result_xor = bitwise1 ^ bitwise2 ,  result_not = ~ bitwise1;
        int result_not1 = ~bitwise2;
        int result_leftshift = bitwise1 << 1 , result_rightshift = bitwise1 >> 2;
        int add = arithmetic1 + arithmetic2 , sub = arithmetic1 - arithmetic2;
        int multi = arithmetic1 * arithmetic2 , div = arithmetic1 / arithmetic2;
        int modulus = arithmetic1 % arithmetic2;
        boolean land = (logical1 > logical3) && (logical1 > logical2);
        boolean land1 = (logical1 > logical3) && (logical1 == logical2);
        boolean lor1 = (logical1 > logical3) | (logical1 > logical2);
        boolean lor2 = (logical1 > logical3) | (logical1 == logical2);
        boolean lnot1 = (!(logical1 != logical2));
        boolean lnot2 = (!(logical1 > logical3));



        System.out.println("Java Operators");
        System.out.println("******************************************************");
        System.out.println("******Bitwise Operators*******");
        System.out.println("Bitwise AND = "+result_and);
        System.out.println("Bitwise OR = "+result_or);
        System.out.println("Bitwise XOR = "+result_xor);
        System.out.println("Bitwise NOT = "+result_not);
        System.out.println("Bitwise NOT = "+result_not1);
        System.out.println("Bitwise LEFT SHIFTED = "+result_leftshift);
        System.out.println("Bitwise RIGHT SHIFTED = "+result_rightshift);
        System.out.println("\n*****Arithmetic Operators*****");
        System.out.println("Addition ="+add);
        System.out.println("Subtraction ="+sub);
        System.out.println("Multiplication = "+multi);
        System.out.println("Division = "+div);
        System.out.println("Modulus (Remainder) = "+modulus);
        System.out.println("\n*****Logical Operators*****");
        System.out.println("Logical AND = "+ land);
        System.out.println("Logical AND = "+ land1);
        System.out.println("Logical OR = "+ lor1);
        System.out.println("Logical OR = "+ lor2);
        System.out.println("Logical NOT = "+ lnot1);
        System.out.println("Logical NOT = "+ lnot2);
        System.out.println("\n*****Compound Assignment Operators*****");
        int shorthand;
        shorthand = num;
        shorthand += num;
        System.out.println("Shorthand Assignment Operators += "+shorthand);
        shorthand -= num;
        System.out.println("Shorthand Assignment Operators -= "+shorthand);
        shorthand *= num;
        System.out.println("Shorthand Assignment Operators *= "+shorthand);
        shorthand /= num;
        System.out.println("Shorthand Assignment Operators /= "+shorthand);
        shorthand %= num;
        System.out.println("Shorthand Assignment Operators %= "+shorthand);
        int a = 10 , b;
        System.out.println("\n*****Increment And Decrement Operators*****");
        b = a;
        --b;
        System.out.println(a+" "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
        --b;
        --a;
        System.out.println(a+"  "+ b);
    }
}
