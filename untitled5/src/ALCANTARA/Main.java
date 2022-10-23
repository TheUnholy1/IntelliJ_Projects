package ALCANTARA;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("***WORKSHOP 7***");
        System.out.println("***Area of Square");
        System.out.print("Enter Side  of Square is: ");
        double square = s.nextDouble();
        double area_square = square * square;
        System.out.println("Area of Square is: "+area_square);
        System.out.println("***Area of Triangle***");
        System.out.print("Enter the width of the Triangle: ");
        double width_t = s.nextDouble();
        System.out.print("Enter the height of the Triangle: ");
        double height_t = s.nextDouble();
        double triangle = (width_t * height_t) / 2;
        System.out.println("Area of Triangle is: "+triangle);
        System.out.println("***Area of Rectangle***");
        System.out.print("Enter the length of Rectangle: ");
        double length_rec = s.nextDouble();
        System.out.print("Enter the width of Rectangle: ");
        double width_rec = s.nextDouble();
        double area_rec = width_rec * length_rec;
        System.out.println("Area of Rectangle is: "+area_rec);
    }
}
