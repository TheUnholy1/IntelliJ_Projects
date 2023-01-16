package ALCANTARA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array :");
        int arrLength = sc.nextInt();

        int[] xArray = new int[arrLength];

        System.out.println("Enter the elements of the array :");
        for(int i = 0; i < arrLength; i++) { //comment
            xArray[i] = sc.nextInt();
        }
        System.out.println("One dimensional array elements are :");
        for(int num : xArray){
            System.out.println(num);
        }
        int sum = 0;
        for (int num : xArray) {
            sum += num;

        }

        System.out.println("Total sum of the listed array is " + sum);
        double average = sum / arrLength;
        System.out.println("Total average of the listed array is " +
                average);

        String [] cars = {"toyota", "mazda", "mitsubishi","ford","nissan"};
        //use for each loop to iterate over array

        for (String car : cars) {
            System.out.println(car);
        }



    }
}
