package array;

import java.util.Scanner;

public class ReversUptoPerticularLimit {

	public static void main(String[] args) {
		int[] arr;
		int size,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		System.out.println("LAUNDE");
		System.out.println("enter upto range");
		x=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr1=alter(arr, x);
		for(int i:arr1)
		{
			System.out.print(i+" ");
		}
	}

	private static int[] alter(int[] arr, int x) {
		int start=1;
		int end=x;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}

}
