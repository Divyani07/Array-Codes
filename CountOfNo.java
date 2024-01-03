package array;

import java.util.Scanner;

public class CountOfNo {

	public static void main(String[] args) {
		int[] arr;
		int size,no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements in array" );
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		 no=countNo(arr,2);
		System.out.println("no of count="+no);

	}

	private static int countNo(int[] arr, int i) {
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==i)
				count++;
		}
		return count;
	}

}
