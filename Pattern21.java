package Pattern;
import java.util.Scanner;
public class Pattern21 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//5
		int t=n,x=n;
	   
		
		for(int i=1;i<=n;i++)//Number of lines
		{
			
			
			for(int j=1;j<n*2;j++)//number of * in each line
			{
				if(j<=x)
				System.out.print("*");
				else if(j>=t)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			t++;
			x--;
			
			System.out.println();
		}
		

	}

}
