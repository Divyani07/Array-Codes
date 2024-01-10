package array;
//
//public class MAXMIN {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
import java.util.*;
/*
 Given an array, write functions to find the minimum and 
 maximum elements in it. 
 */
public class MAXMIN {
	public static int[] MAXMIN(int[] arr)
	{
		int[] arr1=new int[2];
		Arrays.sort(arr);
		arr1[0]=arr[arr.length-1];
		arr1[1]=arr[0];
		return arr1;
	}
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
		int[] arr1=MAXMIN(arr);
		System.out.println("largest element");
		System.out.println(arr1[0]);
		System.out.println("smalleswt element");
		System.out.println(arr1[1]);
	}

}
