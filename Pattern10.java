package Pattern;
import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//5
		
	
		
		for(int i=1;i<=n;i++)//Number of lines
		{
			for(int j=1;j<=n-i;j++)//number of * in each line
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
