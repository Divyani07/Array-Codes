package array;

import java.util.HashMap;
import java.util.Scanner;

public class TWOSUM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		int[] index=new int[2];
		int size,no,sum=0;
		System.out.print("enter size of array=");
		size=sc.nextInt();
		arr=new int[size];
		System.out.print("enter no=");
		no=sc.nextInt();
		System.out.println("enter "+size+" elements for array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(no==arr[i]+arr[j])
				{
					index[0]=i;
					index[1]=j;
				}
			}
		}
		for(int i=0;i<index.length;i++)
		{
			System.out.println(index[i]);
		}
		
		
	}

}
