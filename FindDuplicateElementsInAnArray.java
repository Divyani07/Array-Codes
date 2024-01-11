//check which elements are duplicate in an array
package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDuplicateElementsInAnArray {

	public static void main(String[] args) {
		int[] arr;
		
		int i,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements in array");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr2=CheckDuplicacy(arr);
		for(int k:arr2)
		{
			System.out.println(k+" ");
		}
		
	}

	private static int[] CheckDuplicacy(int[] arr) {
		List<Integer>l=new ArrayList<>();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					l.add(arr[i]);
					break;
				}
			}
		}
		int[] arr1=l.stream().mapToInt(Integer::intValue).toArray();
		return arr1;
	}
}
