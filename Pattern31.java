package Pattern;
import java.util.Scanner;
public class Pattern31
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//7||9
		
		
	   
		
		for(int i=1;i<=n;i++)//Number of lines
		{
			for(int j=1;j<=n;j++)
			{
				//if(i==1||i==n||j==1||j==n||i==j||i+j==n+1)(This is for multiplication symbol in * box)
				
				if(i==j||i+j==n+1||i==n/2+1||j==n/2+1)
				//if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1)(This is for Additional symbol in * box)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
				
			
			System.out.println();
		}
	}
	
}
			