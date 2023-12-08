package Array_prac;

import java.util.Scanner;

public class copy_array {

	public static void main(String[] args) {
		// to copy the elements of one array into another array.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of arrays:");
		int size=sc.nextInt();
		
		int[] arr1 = new int[size];
		int[] arr2 = new int [size];
		System.out.println("Enter "+size+" integer values: ");
		for(int i=0; i<size; i++) {
			arr1[i]=sc.nextInt();
		}
//		System.out.print("arr1:"); 
//		for(int i=0; i<size; i++) {
//			System.out.print(arr1[i]+" ");
//		}
		
		System.out.print("\narr2:"); 
		for(int i=0; i<size; i++) {
			arr2[i]=arr1[i];
		}
		for(int i=0; i<size; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
