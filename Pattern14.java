package Pattern;
import java.util.Scanner;
public class Pattern14 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//5
		
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i-1;j++)
		{
			System.out.println(" ");
		}
		for(int j=i;j<=n;j++)
			System.out.print(j+" ");
		
	}
	
	
	
		System.out.println();
		
	}

}
