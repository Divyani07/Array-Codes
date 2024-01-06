package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoOfUniqueElements {

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
		int no1=CountUniqueElement(arr);
		System.out.println("no of unique element="+no1);
	}

	private static int CountUniqueElement(int[] arr) {
		int uniqueelement;
		Set<Integer> s=new HashSet<>();
		for(int i:arr)
		{
			s.add(i);
		}
		
		return s.size();
	}

}
