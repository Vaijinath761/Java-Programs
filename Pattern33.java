package Pattern;
import java.util.Scanner;
public class Pattern33
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//5
		
		int sp=n/2,st=1;		
		for(int i=1;i<=n;i++)//Number of lines
		{
			
			for(int j=1;j<=sp;j++)//number of * in each line
			{
				System.out.print("  ");
				
			}
			
			for(int j=1;j<=st;j++)
			{
				System.out.print(j+" ");
				if(j<st)
			    System.out.print("* ");
				
			}
			if(i<=n/2)
			{
				sp--;
				st++;
			}
			else
			{
				sp++;
				st--;
			}
			
			System.out.println();
		}

	}

}
