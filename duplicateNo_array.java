package Array_prac;

import java.util.Scanner;

public class duplicateNo_array {
      public static void main(String[] args) {
      	  //to count the total number of duplicate elements in an array.
    	Scanner sc = new Scanner(System.in);
  		System.out.println("Enter size of array: ");
  		int size=sc.nextInt();
  		int cnt=0;
  		int[] arr = new int[size];
  		System.out.println("Enter "+size+" array elements");
  		for(int i=0; i<size; i++) {
  			arr[i]=sc.nextInt();
        }
  		for(int i=0; i<size; i++) {
  			for(int j=i+1; j<size; j++) {
  				if(arr[i] == arr[j]) {
  					cnt++;
  					break;
  				}
  			}
  		}
  		
  		System.out.println("duplicate: "+cnt);//showing wrong ouput 
   }
}