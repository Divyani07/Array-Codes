package array;

import java.util.Scanner;

public class LargestAndSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,temp,n;
		System.out.println("enter size of array");
		n=sc.nextInt();
		int[] arr=new int[n];
		n=n-1;
		System.out.println("enter "+n+" element");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		System.out.println("largest element="+arr[0]);
		System.out.println("smallest element="+arr[n]);
	}

}
