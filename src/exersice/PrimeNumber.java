package exersice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		System.out.println("Enter any num");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a PrimeNumber");

	}

}
