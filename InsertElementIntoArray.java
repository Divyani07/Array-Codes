/*Write a Java program to insert an element 
(specific position) into an array*/
import java.util.*;
public class InsertElementIntoArray{
	public static void main(String[] args){
		int[] array={25,14,56,15,36};
		int[] array1=InsertElementAtSpecificPosition(array,2,86);
		System.out.println(Arrays.toString(array));
		System.out.print(Arrays.toString(array1));
	}
	public static int[] InsertElementAtSpecificPosition(int[] array,int position,int value){
		int[] array2=new int[array.length+1];
		/*int j=0;
		for(int i=0; i<array.length; i++){
		if(i==position){
			array2[j]=value;
		}
		else{
		array2[j]=array[i];
		j++;
		}
		}*/
		

		for(int i=0; i<array2.length; i++){
			if(i<position)
				array2[i]=array[i];
			else if(i==position)
				array2[i]=value;
			else
				array2[i]=array[i-1];
			
		}
		return array2;
	
	}

}