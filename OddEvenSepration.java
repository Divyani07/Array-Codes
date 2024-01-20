//Write a program in JAVA to separate odd and even integers into separate arrays.
package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenSepration {

	public static void ElementSepration(int[] arr)
	{
		List<Integer>OddList=new ArrayList<>();
		List<Integer>EvenList=new ArrayList<>();
		int i,j;
		for(int a:arr)
		{
			if(a%2==0)
				EvenList.add(a);
			else
				OddList.add(a);
		}
		System.out.print("Odd no list=>");
		for(int b:OddList)
		{
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.print("Even no list=>");
		for(int c:EvenList)
		{
			System.out.print(c+" ");
		}
		
	}
	public static void main(String[] args) {
		int[] arr;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ElementSepration(arr);
	}

}
