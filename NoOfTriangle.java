package array;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfTriangle {

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
		int x=NoOfTriangle(arr);
		System.out.println("no of triangle from an array="+x);

	}
	 public static int NoOfTriangle(int[] array) {
	        Arrays.sort(array); // Sort the array to easily check for triangle conditions
	        int count = 0;
	        int n = array.length;

	        for (int i = 0; i < n - 2; i++) {
	            int k = i + 2; // Initialize the third side of the triangle

	            for (int j = i + 1; j < n; j++) {
	                while (k < n && array[i] + array[j] > array[k]) {
	                    k++;
	                }

	                // All elements from j to k-1 can form triangles with i and j
	                count += k - j - 1;
	            }
	        }

	        return count;
	 }
}
