package array;
import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int[] array ;
        int size;
        System.out.println("enter size of element");
        size=sc.nextInt();
        array=new int[size];
        System.out.println("enter "+size+" element");
        for(int i=0;i<array.length;i++)
        {
        	array[i]=sc.nextInt();
        }
        printUniqueElements(array);
    }

    private static void printUniqueElements(int[] array) {
        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>();

        System.out.println("Unique elements in the array:");

        // Iterate through the array
        for (int element : array) {
            // If the element is not present in the set, add it to the set and print
            if (uniqueSet.add(element)) {
                System.out.print(element + " ");
            }
        }

        System.out.println(); // Print a new line for better readability
    }
}
