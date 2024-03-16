// Write a Java program to reverse a String.
import java.util.*;
public class ReverseAStrnig{
	public static void main(String[] args){
		String str="Divyani";//"Hello World";
		String reversestr=ReverseString(str);
		System.out.print(reversestr);
	}
	
	public static String ReverseString(String str){
		char[] charArray=str.toCharArray();
		int start=0;
		int end=charArray.length-1;
		while(start<end){
			char temp=charArray[start];
			charArray[start]=charArray[end];
			charArray[end]=temp;
			start++;
			end--;
		
		}
		return new String(charArray);
	}

}