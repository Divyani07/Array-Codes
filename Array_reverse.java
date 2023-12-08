package Array_prac;
import java.util.Scanner;
public class Array_reverse {

	public static void main(String[] args) {
		//Write a program to read n number of values in an array and 
		//display them in reverse order.
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter size of array:");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter"+size+" integer values: ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]);
		}
		
		for(int j=(size-1); j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
		
		
	}

}
