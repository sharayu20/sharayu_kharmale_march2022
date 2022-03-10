class Pattn10
{
	public static void main(String args[])
	{
		
		for(int i=6;i>=1;i--)
		{
			int alpha=65;
			for(int j=i;j>=1;j--)
		       {
				System.out.print(" ");
				
				}
				for(int k=i;k<5;k++)
				{
				System.out.print((char)(alpha+k)+" ");
				
				}
			
			System.out.println();
		}
		
	}
}
