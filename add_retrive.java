package Array_prac;
import java.util.Scanner;
public class add_retrive {

	public static void main(String[] args) {
//		Write a program to store elements in an array and print them
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" array elements");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.print("Array elements:");
		for(int j=0; j<size; j++) {
			System.out.print(+arr[j]+" ");
		}
		
		
	}

}
