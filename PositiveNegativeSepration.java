package array;
import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegativeSepration {

	public static void main(String[] args) {
		int[] arr;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements in array" );
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr1=ArrangeTheElement(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

	private static int[] ArrangeTheElement(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

}
