package array;
import java.util.Scanner;
public class SecondLargestElement2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int i,max=0,temp=0;
		System.out.println("enter "+size+" elements");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
				if(arr[i]>max)
				{
					max=arr[i];
					//temp=arr[i];
				}
				if(arr[i]<max && arr[i]>temp)
				{
					max=max;
					temp=arr[i];
				}
		}
		System.out.println("max="+max+" second largest element="+temp);
	}

}
