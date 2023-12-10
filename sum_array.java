package Array_prac;
import java.util.Scanner;
public class sum_array {

	public static void main(String[] args) {
		// find the sum of all elements of the array.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int sum=0;
		int[] arr=new int[size];
		System.out.println("Enter "+size+" array elements:");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum:"+sum);
	}

}
