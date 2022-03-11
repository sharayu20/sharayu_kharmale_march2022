import java.util.Scanner;
class Ass1_6
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int year = sc.nextInt();
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		System.out.println("year is leap yr");
		else
		System.out.print("year is not leap yr");
	}
}
		