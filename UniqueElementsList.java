package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElementsList {

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
		int[] arr1=showUniqueElements(arr);
		for(int i:arr1)
		{
			System.out.print(i+" ");
		}

	}

	private static int[] showUniqueElements(int[] arr) {
		Set<Integer>s=new HashSet<>();
		for(int i:arr)
		{
			s.add(i);
		}
		int[] arr1=s.stream().mapToInt(Integer::intValue).toArray();

		
		return arr1;
	}

}
