package Pattern;
import java.util.Scanner;
public class Pattern30
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//7||9
		
		
	   
		
		for(int i=1;i<=n;i++)//Number of lines
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int x=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+"    ");
				x=x*(i-j)/j;
				
			}
			
			System.out.println();
		}
		
	}
	
}
			