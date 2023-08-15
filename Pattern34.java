package Pattern;
import java.util.Scanner;
public class Pattern34
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//5
		
		int sp=0,st=n;		
		for(int i=1;i<=n;i++)//Number of lines
		{
			
			for(int j=1;j<=sp;j++)//number of * in each line
			{
				System.out.print("  ");
				
			}
			int x=sp+1;
			for(int j=1;j<=st;j++)
			{
				System.out.print(x+" ");
				
				if(j<=st/2)
					x++;
				else
					x--;
			    
				
			}
			if(i<=n/2)
			{
				sp++;
				st=st-2;
			}
			else
			{
				sp--;
				st=st+2;
			}
			
			System.out.println();
		}

	}

}
