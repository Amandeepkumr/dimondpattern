package TestPK;
import java.util.*;
public class Aman
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=i-1;j>=1;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			for(j=n-1;j>i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}


