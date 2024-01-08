package array;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		majorityElement(arr);
	}

	private static void majorityElement(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count>=arr.length/2)
				{
				System.out.println("majority element of the array ="+arr[i]);
				break;
				}
		}
	}

}
