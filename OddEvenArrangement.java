package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenArrangement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		int size;
		System.out.println("enter size");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr=ArrangeElements(arr);
		System.out.println("arrange array");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

	private static int[] ArrangeElements(int[] arr) {
		List<Integer>even=new ArrayList<>();
		List<Integer>odd=new ArrayList<>();
		List<Integer>no=new ArrayList<>();
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
			else
				odd.add(arr[i]);
		}
		for(int X:even)
		{
			no.add(X);
		}
		for(int X:odd)
		{
			no.add(X);
		}

		int[] no1=new int[no.size()];
		for(i=0;i<no1.length;i++)
		{
			no1[i]=no.get(i);
		}

		return no1;
	}
  


}
