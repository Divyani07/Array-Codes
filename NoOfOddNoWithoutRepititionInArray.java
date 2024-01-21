package array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoOfOddNoWithoutRepititionInArray {

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
		int no=CoundOddNo(arr);
		System.out.println("total unique odd no in an array="+no);
	}

	private static int CoundOddNo(int[] arr) {
		Set<Integer>s=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				s.add(arr[i]);
		}
		
		return s.size();
	}

}
