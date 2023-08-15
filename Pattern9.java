package Pattern;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();//Raghu
		int n=st.length();
		
		
		
		for(int i=1;i<=n;i++)//Number of lines
		{
			for(int j=0;j<i;j++)//number of * in each line//for(int j=1;j<i;j++)
			{
				System.out.print(st.charAt(j)+" ");//System.out.print(st.charAt(j-1)+" ");
				
			}
			System.out.println();
		}

	}

}
