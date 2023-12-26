package array;

import java.util.Scanner;

public class AddElementToArrayInPerticularPosition {

	public static void main(String[] args) {
		int[] arr;
		int[] newarr;
		int i,j,size,temp,no,position;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		newarr=new int[size+1];
		System.out.println("enter "+size+" elements in array");
		for(i=0;i<arr.length ;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter new no");
		no=sc.nextInt();
		System.out.println("enter position where you want to add new element");
		position=sc.nextInt();
		for(i=0;i<arr.length && i<position-1;i++)
		{
			newarr[i]=arr[i];
		}
		newarr[i]=no;
		for(;i<arr.length;i++)
		{
			newarr[i+1]=arr[i];
		}
		System.out.print("old array=>");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("new array=>");
		for(i=0;i<arr.length+1;i++)
		{
			System.out.print(newarr[i]+" ");
		}

	}

}
