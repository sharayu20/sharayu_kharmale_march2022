import java.util.Scanner;
class evenodd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		String sh = (n%2==0)?"even" : "odd";
		System.out.println(n + " is " +sh);
	}
}
		