package arr;

import java.util.Scanner;

public class LargestEle_array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" array elements:");
		int large=arr[0];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>large) {
				large = arr[i];
		    }
		}	
		System.out.println("Largest element in array: ");
		System.out.println(large);

	}

}
