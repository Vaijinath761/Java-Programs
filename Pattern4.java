package Pattern;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)//Number of lines
		{
			for(int j=i;j>=1;j--)//number of * in each line
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
