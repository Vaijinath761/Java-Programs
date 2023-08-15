package Pattern;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)//Number of lines
		{
			for(int j=1;j<=i;j++)//number in each line
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
