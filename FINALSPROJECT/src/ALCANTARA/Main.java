package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Alcantara Jaspher B. BSIT 1-1 FINALS PROJECT

        String letter;
        Scanner s = new Scanner(System.in);
        System.out.println("--------------Jaspher File Inventory--------------"); //12 dash
        System.out.print("Please Choose the Program to Display ( 1 to 10) : ");do{


        int choose = s.nextInt();
        switch (choose) {

            case 1:
                System.out.println("--------------------Workshop 1--------------------");
                do {
                    System.out.print("\n");
                    System.out.print("Jaspher B. Alcantara, ");
                    System.out.print("20, ");
                    System.out.print("Maitim 2nd Central, Tagaytay City, ");
                    System.out.print("1.12");
                    System.out.println("\n");
                    System.out.println("Jaspher B. Alcantara");
                    System.out.println("20");
                    System.out.println("Maitim 2nd Central, Tagaytay City");
                    System.out.println("1.12");
                    System.out.print("\n");
                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();
                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 2:
                System.out.println("--------------------Workshop 2--------------------");
                do {
                    System.out.print("\n");
                    s.nextLine();
                    System.out.print("Enter your full name: ");
                    String Name = s.nextLine();


                    System.out.print("Enter your course: ");
                    String Course = s.nextLine();

                    System.out.print("Enter your Gender: ");
                    String Gender = s.nextLine();

                    System.out.print("Enter your Civil Status: ");
                    String Status = s.nextLine();

                    System.out.print("Enter your Citizenship: ");
                    String Citizen = s.nextLine();

                    System.out.print("Enter your Weight: ");
                    int Weight = s.nextInt();


                    System.out.print("Enter your Height: ");
                    int Height = s.nextInt();


                    System.out.print("Enter your Contact Number: ");
                    long Number = s.nextLong();

                    System.out.print("\n");
                    System.out.println("Name: " + Name);
                    System.out.println("Course: " + Course);
                    System.out.println("Gender: " + Gender);
                    System.out.println("Civil Status: " + Status);
                    System.out.println("Citizenship: " + Citizen);
                    System.out.println("Weight: " + Weight + "kg");
                    System.out.println("Height: " + Height + "cm");
                    System.out.println("Contact Number: " + Number);
                    System.out.print("\n");
                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();
                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 3:
                System.out.println("--------------------Workshop 3--------------------");
                do {
                    System.out.print("\n");
                    System.out.print("Please Enter the First Number: ");
                    int first_Num = s.nextInt();

                    System.out.print("Please Enter the Second Number: ");
                    int second_Num = s.nextInt();

                    int temporary = first_Num;
                    first_Num = second_Num;
                    second_Num = temporary;
                    System.out.print("\n");

                    System.out.println("The Value of First Number is: " + first_Num);
                    System.out.println("The Value of Second Number is: " + second_Num);
                    System.out.print("\n");

                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();
                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 4:
                System.out.println("--------------------Workshop 4--------------------");
                do {
                    System.out.print("\n");
                    System.out.println("Hello Guys! \nI am");


                    System.out.print("\n");

                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();
                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 5:
                System.out.println("--------------------Workshop 5--------------------");
                do {
                    System.out.print("\n");
                    System.out.println("\n--------Sum and Difference of two numbers---------\n");
                    System.out.print("Please Enter The First  Number: ");
                    int firstNum = s.nextInt();
                    System.out.print("Please Enter The Second Number: ");
                    int secondNum = s.nextInt();
                    System.out.print("\n");
                    int sum = firstNum + secondNum;
                    int diff = firstNum - secondNum;
                    String total = String.format("The sum of %d and %d is: %d", firstNum, secondNum, sum);
                    System.out.println(total);
                    String difference = String.format("The difference of %d and %d is: %d", firstNum, secondNum, diff);
                    System.out.println(difference);
                    System.out.print("\n");
                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();

                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 6:
                System.out.println("--------------------Workshop 6--------------------");
                do {
                    System.out.print("\n");
                    int bitwise1 = 45, bitwise2 = 10;
                    int num = 15;
                    int logical1 = 10, logical2 = 10, logical3 = 5;
                    int arithmetic1 = 10, arithmetic2 = 15;
                    int result_and = bitwise1 & bitwise2, result_or = bitwise1 | bitwise2;
                    int result_xor = bitwise1 ^ bitwise2, result_not = ~bitwise1;
                    int result_not1 = ~bitwise2;
                    int result_leftshift = bitwise1 << 1, result_rightshift = bitwise1 >> 2;
                    int add = arithmetic1 + arithmetic2, sub = arithmetic1 - arithmetic2;
                    int multi = arithmetic1 * arithmetic2, div = arithmetic1 / arithmetic2;
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
                    System.out.println("Bitwise AND = " + result_and);
                    System.out.println("Bitwise OR = " + result_or);
                    System.out.println("Bitwise XOR = " + result_xor);
                    System.out.println("Bitwise NOT = " + result_not);
                    System.out.println("Bitwise NOT = " + result_not1);
                    System.out.println("Bitwise LEFT SHIFTED = " + result_leftshift);
                    System.out.println("Bitwise RIGHT SHIFTED = " + result_rightshift);
                    System.out.println("\n*****Arithmetic Operators*****");
                    System.out.println("Addition =" + add);
                    System.out.println("Subtraction =" + sub);
                    System.out.println("Multiplication = " + multi);
                    System.out.println("Division = " + div);
                    System.out.println("Modulus (Remainder) = " + modulus);
                    System.out.println("\n*****Logical Operators*****");
                    System.out.println("Logical AND = " + land);
                    System.out.println("Logical AND = " + land1);
                    System.out.println("Logical OR = " + lor1);
                    System.out.println("Logical OR = " + lor2);
                    System.out.println("Logical NOT = " + lnot1);
                    System.out.println("Logical NOT = " + lnot2);
                    System.out.println("\n*****Compound Assignment Operators*****");
                    int shorthand;
                    shorthand = num;
                    shorthand += num;
                    System.out.println("Shorthand Assignment Operators += " + shorthand);
                    shorthand -= num;
                    System.out.println("Shorthand Assignment Operators -= " + shorthand);
                    shorthand *= num;
                    System.out.println("Shorthand Assignment Operators *= " + shorthand);
                    shorthand /= num;
                    System.out.println("Shorthand Assignment Operators /= " + shorthand);
                    shorthand %= num;
                    System.out.println("Shorthand Assignment Operators %= " + shorthand);
                    int a = 10, b;
                    System.out.println("\n*****Increment And Decrement Operators*****");
                    b = a;
                    --b;
                    System.out.println(a + " " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    --b;
                    --a;
                    System.out.println(a + "  " + b);
                    System.out.print("\n");

                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();
                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 7:
                System.out.println("--------------------Workshop 7--------------------");
                do {
                    System.out.print("\n");
                    System.out.println("********Area of Square********"); //8stars
                    System.out.print("\n");
                    System.out.print("Please Enter the Side of Square: ");
                    double square = s.nextDouble();
                    double area_Square = square * square;
                    System.out.println("The Area of Square is: " + area_Square);

                    System.out.print("\n");
                    System.out.println("********Area of Triangle********");
                    System.out.print("\n");
                    System.out.print("Please Enter the Width of the Triangle: ");
                    double width_T = s.nextDouble();
                    System.out.print("Please Enter the Height of the Triangle: ");
                    double height_t = s.nextDouble();
                    double triangle = (width_T * height_t) / 2;
                    System.out.println("The Area of Triangle is: " + triangle);

                    System.out.print("\n");
                    System.out.println("********Area of Rectangle********");
                    System.out.print("\n");
                    System.out.print("Please Enter the length of Rectangle: ");
                    double length_rec = s.nextDouble();
                    System.out.print("Please Enter the width of Rectangle: ");
                    double width_rec = s.nextDouble();
                    double area_rec = width_rec * length_rec;
                    System.out.println("Area of Rectangle is: " + area_rec);
                    System.out.print("\n");

                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();
                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 8:
                System.out.println("--------------------Workshop 8--------------------");
                do {
                    System.out.print("\n");
                    System.out.print("Enter the Number of Minutes: ");
                    int minutes = s.nextInt();
                    int year = minutes / 525600;
                    int remainingMinutes = minutes % 525600;
                    int day = remainingMinutes / 1440;
                    System.out.println(minutes + " minutes is approximately " + year + " years & " + day + " days.");
                    System.out.print("\n");

                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();
                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 9:
                System.out.println("--------------------Workshop 9--------------------"); //20 dash
                do {
                    System.out.print("\n");
                    System.out.print("Enter A Character: ");

                    char let = s.next().charAt(0);

                    String consonantOrvowel = (let == 'a' || let == 'e' ||
                            let == 'i' || let == 'o' || let == 'u' || let == 'A' ||
                            let == 'E' || let == 'I' || let == 'O' || let == 'U')
                            ? "Vowel" : "Consonant";

                    s.nextLine();
                    System.out.print("Enter A Number: ");

                    int input = s.nextInt();

                    String evenOrodd = (input % 2 == 0) ? "Even" : "Odd";
                    System.out.print("\n");
                    System.out.println("Character  is " + consonantOrvowel);
                    System.out.print("\n");
                    System.out.println("Number is " + evenOrodd);
                    System.out.print("\n");

                    System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                    letter = s.next();
                }
                while (letter.equalsIgnoreCase("Yes"));
                System.out.println("----------Thank you----------");
                break;
            case 10:
                System.out.println("--------------------Workshop 10--------------------");
                System.out.print("Please Choose the Program to Display ( 1 or 2) : ");
                int num = s.nextInt();
                if (num == 1) {
                    do {
                        System.out.print("\n");
                        System.out.print("Enter A Character: ");

                        char let = s.next().charAt(0);

                        String consonantOrvowel = (let == 'a' || let == 'e' ||
                                let == 'i' || let == 'o' || let == 'u' || let == 'A' ||
                                let == 'E' || let == 'I' || let == 'O' || let == 'U')
                                ? "Vowel" : "Consonant";

                        s.nextLine();
                        System.out.print("Enter A Number: ");

                        int input = s.nextInt();

                        String evenOrodd = (input % 2 == 0) ? "Even" : "Odd";
                        System.out.print("\n");
                        System.out.println("Character  is " + consonantOrvowel);
                        System.out.print("\n");
                        System.out.println("Number is " + evenOrodd);
                        System.out.print("\n");

                        System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                        letter = s.next();
                    }
                    while (letter.equalsIgnoreCase("Yes"));
                    System.out.println("----------Thank you----------");
                } else {
                    do {
                        System.out.print("\n");
                        System.out.print("Please Enter the First Number: ");
                        int num1 = s.nextInt();

                        System.out.print("\n");
                        System.out.print("Please Enter the Second Number: ");
                        int num2 = s.nextInt();

                        System.out.print("\n");
                        int total = num1 + num2;
                        System.out.println("The sum is " + total);
                        System.out.print("\n");

                        System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
                        letter = s.next();
                    }
                    while (letter.equalsIgnoreCase("Yes"));
                    System.out.println("----------Thank you----------");
                }
                break;
            default:
                System.out.println("Please Enter 1 to 10 Only!");
            }
            System.out.print("Do you want to Perform the Operation Again? Yes or No: ");
            letter = s.next();
            s.next();
        }while (letter.equalsIgnoreCase("Yes"));
    }
}
