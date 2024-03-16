//Write a Java program to remove a specific element from an array.
import java.util.*;
public class RemoveElemnt{
	public static void main(String[] args){
	int[] arr={25,14,56,15,36}; 
	int[] arr2=RemoveSpecificElement(arr,14);
	System.out.println(Arrays.toString(arr2));
	
	}
	public static int[] RemoveSpecificElement(int[] arr,int num){
		int[] arr1=new int[arr.length-1];
		int j=0;
			for(int i=0; i<arr.length; i++){
				if(num==arr[i]){
					continue;
				}
				else{
					arr1[j]=arr[i];
					j++;
				}
			}
			return arr1;
	
	}
} 