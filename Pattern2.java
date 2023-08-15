package Pattern;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)//Number of lines
		{
			for(int j=i;j<=n;j++)//number of * in each line
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
