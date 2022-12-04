package ALCANTARA;
import java.util.*;
public class Main {
// lab exam ALCANTARA, ANONUEVO & DIAZ
    public static void main(String[] args) {
	// write your code here
        int [] array_one = {1,5,7,11,14,12,10,28,24,33};
        int [] array_two = {14,8,2,28,16,5,15,33,55,89};

        System.out.println("First Set of Array : "+Arrays.toString(array_one));
        System.out.println("Second Set of Array : "+Arrays.toString(array_two));
        System.out.println("\nElements in the First Set of Array:");
        for (int i = 0; i < array_one.length; i++)
            System.out.println("Array1 ["+i +"]"+" : "+array_one[i]);

        System.out.println("\nElements in the Second Set of Array:");
        for (int i = 0; i < array_two.length; i++)
            System.out.println("Array2 ["+i +"]"+" : "+array_two[i]);

        for (int i= 0; i < array_one.length;i++)
        {
            for (int j = 0; j < array_two.length;j++)
            {
                if (array_one[i] == (array_two[j]))
                {
                    System.out.println("Common element is : "+(array_one[i]));
                }}}
    }
}
