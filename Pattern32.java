package Pattern;
import java.util.Scanner;
public class Pattern32 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//5
		
	
		
		for(int i=1;i<=n;i++)//Number of lines
		{
			int x=i;
			for(int j=1;j<=i;j++)//number of * in each line
			{
				System.out.print(x+" ");
				x=x+n-j;
				
			}
			
			System.out.println();
		}

	}

}
