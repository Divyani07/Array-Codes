/*Write a program in JAVA to insert the values in the array (sorted list).
Test Data :
Insert New value in the sorted array :
-----------------------------------------
Input the size of array : 5
Input 5 elements in the array in ascending order:
element - 0 : 2
element - 1 : 5
element - 2 : 7
element - 3 : 9
element - 4 : 11
Input the value to be inserted : 8
The exist array list is :
2 5 7 9 11
After Insert the list is :
2 5 7 8 9 11*/
/*Write a program in JAVA to insert the values in the array (sorted list).
Test Data :
Insert New value in the sorted array :
-----------------------------------------
Input the size of array : 5
Input 5 elements in the array in ascending order:
element - 0 : 2
element - 1 : 5
element - 2 : 7
element - 3 : 9
element - 4 : 11
Input the value to be inserted : 8
The exist array list is :
2 5 7 9 11
After Insert the list is :
2 5 7 8 9 11*/
package array;

import java.util.Scanner;

public class InsertValueInArrayAndSortIt {
	public static int[] Insert(int[] arr,int e)
	{
		int[] NewArr=new int[arr.length+1];
		int i,j,temp;
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<arr.length && arr[i]<e;i++)
		{
			NewArr[i]=arr[i];
		}
		NewArr[i]=e;
		for(;i<arr.length;i++)
		{
			NewArr[i+1]=arr[i];
		}
		return NewArr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		int size,i,e;
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements in array");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter new element");
		e=sc.nextInt();
		int[] NewArr=Insert(arr, e);
		for(int x:NewArr)
		{
			System.out.print(x+" ");
		}
	}

}
