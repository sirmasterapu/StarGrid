/**
*This program prints a star filled pattern
*@author Apurva Memani
*/
public class Loops
{
	
	public static void main(String[] args)
	{
		printStarGrid(5);
		System.out.println("----------");
		printReverseStarGrid(5);
	}
	public static void nestedLoop(int n)
	{
		int x = 1;
		while(x<=n)
		{
		
			int i = 1;
			for(; i <=n; i++)
			{
				System.out.print(" * ");
				
			}
			System.out.println("");
			x++;
		}
	}
	
	public static void printStarGrid(int n)
	{
		int x = 1;
		int y = n;
		while (n>0)
		{
			for(; n >= 1; n--)
			{
				System.out.print("*");
			}
			System.out.println("");
			n = y;
			n = n-x;
			x++;
			
		}
	}
	

	
	public static void printReverseStarGrid(int n)
	{
		int x = 1;
		int y = x;
		while(x<=n)
		{
		 for(; x>0; x--)
		 {
		 	System.out.print("*");
		 }
		 System.out.println("");
		 x = y;
		 x++;
		 y++;
		}
	}
	
}