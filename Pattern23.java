package Pattern;
import java.util.Scanner;
public class Pattern23 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//5
		int x=n/2+1;
	   
		
		for(int i=1;i<=x;i++)//Number of lines
		{
			if(i==1||i==x)
			{
				System.out.println("  *");
				continue;
			}
			if(i==2||i==x-1)
			
				System.out.print(" ");
				System.out.print("*");
				System.out.print(" ");
			
			if(i>2&&i<x-1)
			
				System.out.print("  ");
				System.out.print("*");
				System.out.println();
			
			
			
			
			
		}
		

	}

}
