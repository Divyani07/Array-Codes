package array;

import java.util.Scanner;

public class DisplayPositionalEliment {
public static int GetElement(int[] arr,int p)
{
	int i,j,temp,n;
	n=p-1;
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
	return arr[n];
}
	public static void main(String[] args) {
		int size,i,n,no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter "+size+" elements");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter position of element ::");
		n=sc.nextInt();
		no=GetElement(arr,n);
		System.out.println("element at position "+n+"="+no);
	}
}
