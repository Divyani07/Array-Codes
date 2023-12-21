package array;
import java.util.Scanner;
public class Array {
	public static int countDupicateNo(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr1;
		int size=0,count=0;
		System.out.println("enter size of the array:");
		try(Scanner sc=new Scanner(System.in))
		{
			size=sc.nextInt();
			arr1=new int[size];
			System.out.println("enter "+size+" elements");
			for(int i=0;i<size;i++)
			{
				arr1[i]=sc.nextInt();
			}
			 count=countDupicateNo(arr1);
			System.out.println("total duplicate no="+count);
		}

	}

}
