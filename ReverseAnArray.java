// Write a Java program to reverse an array of integer values.
import java.util.*;
public class ReverseAnArray{
	public static void main(String[] args){
		int[] arr={5,2,7,9,6};
		int[] arr1=ReverseArray(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	public static int[] ReverseArray(int[] arr){
		int start=0;
		int end=arr.length-1;
		while(start<end){
		int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		return arr;
	}

}