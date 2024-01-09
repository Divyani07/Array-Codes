package array;

import java.util.Scanner;

public class MagicNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("enter any no:");
		no=sc.nextInt();
		int r=0;
		int sum=0;
		int temp=no;
		do {
			sum=0;
			while(no>0)
			{
				r=no%10;
				sum=sum+r;
				no=no/10;
			}
			no=sum;
		}while(sum>9);
		
		if(no==1)
			{
			no=temp;
			System.out.println(no+" is a magic no");
			}
		else if(no!=1)
		{
			no=temp;
			System.out.println(no+" is not a magic no");
		}
	}

}
