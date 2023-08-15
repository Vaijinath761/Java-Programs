package Pattern;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();//5
		
		int x=1;
		
		for(int i=1;i<=n;i++)//Number of lines
		{
			for(int j=1;j<=n;j++)//number of * in each line
			{
				System.out.print(x+" ");
				x++;
				if(x==10)
					x=1;
			}
			System.out.println();
		}

	}

}
