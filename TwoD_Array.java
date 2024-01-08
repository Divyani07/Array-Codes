package array;

import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the size of row");
		int rows=sc.nextInt();
		System.out.println("enter the size of column");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		System.out.println("enter elements in"+rows+"*"+cols+"matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
