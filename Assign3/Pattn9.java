class Pattn9
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			int alphabet=65;
			for(int j=0;j<=5-i;j++)
		       {
				System.out.print(" ");
				
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print((char)alphabet+" ");
					alphabet++;
				}
			
			System.out.println();
		}
		
	}
}
