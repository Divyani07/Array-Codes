//Write a Java program to sum values of an array.



public class SumOfArrayElements{
	public static void main(String[] args){
		int[] arr={3,4,5,7,9};
	System.out.print("Sum of Array Elements: "+SumOfElements(arr));
		
	}
	public static int SumOfElements(int[] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		return sum;
	}
}
