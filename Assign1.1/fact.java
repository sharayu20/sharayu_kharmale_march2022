import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int factt = 1;
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		factt=factt*i;
		}
		System.out.println("factorial=" +factt);
	}
}
	
		