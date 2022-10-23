package com.company;

import java.util.Scanner;

 class Jas {
    public static void main(String[]args){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String Name = name.nextLine();
        Scanner course = new Scanner(System.in);
        System.out.print("Enter your course: ");
        String Course = course.nextLine();
        Scanner gender = new Scanner(System.in);
        System.out.print("Enter your Gender: ");
        String Gender = gender.nextLine();
        Scanner status = new Scanner(System.in);
        System.out.print("Enter your Civil Status: ");
        String Status = status.nextLine();
        Scanner citizen = new Scanner(System.in);
        System.out.print("Enter your Citizenship: ");
        String Citizen = citizen.nextLine();
        Scanner weight = new Scanner(System.in);
        System.out.print("Enter your Weight: ");
        int Weight = weight.nextInt();
        Scanner height = new Scanner(System.in);
        System.out.print("Enter your Height: ");
        int Height = height.nextInt();
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your Contact Number: ");
        long Number = number.nextLong();
        System.out.print("\n");
        System.out.println("Name: "+Name);
        System.out.println("Course: "+Course);
        System.out.println("Gender: "+Gender);
        System.out.println("Civil Status: "+Status);
        System.out.println("Citizenship: "+Citizen);
        System.out.println("Weight: "+Weight + "kg");
        System.out.println("Height: "+Height + "cm");
        System.out.print("Contact Number: "+Number);

    }
}