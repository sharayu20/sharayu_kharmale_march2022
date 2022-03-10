import java.util.Scanner;
class Ass6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number1 =");
		int number1=sc.nextInt();
		
		System.out.print("Enter first number2 =");
		
		int number2=sc.nextInt();
		System.out.println("sum ="+(number1+number2));
		System.out.println("subtraction ="+(number1-number2));
		System.out.println("mul ="+(number1*number2));
		System.out.println("div ="+(number1/number2));
		System.out.println("mod ="+(number1%number2));
		
		
		
		
	}
}