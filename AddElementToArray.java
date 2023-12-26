/*
 Write a program in C to insert values in the array (unsorted list).
Test Data :
Input the size of array : 4
Input 4 elements in the array in ascending order:
element - 0 : 1
element - 1 : 8
element - 2 : 7
element - 3 : 10
Input the value to be inserted : 5
Input the Position, where the value to be inserted :2
Expected Output :
The current list of the array :
1 8 7 10
After Insert the element the new list is :
1 5 8 7 10
 */
package array;

import java.util.Scanner;

public class AddElementToArray {

	public static void main(String[] args) {
	int[] arr;
	int[] newarr;
	int i,j,size,temp,no;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	size=sc.nextInt();
	arr=new int[size];
	newarr=new int[size+1];
	System.out.println("enter "+size+" elements in array");
	for(i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(i=0;i<arr.length-1;i++)
	{
		for(j=0;j<arr.length-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("enter new no");
	no=sc.nextInt();
	for(i=0;i<arr.length;i++)
	{
		newarr[i]=arr[i];
	}
	newarr[i]=no;
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
