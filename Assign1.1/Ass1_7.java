import java.util.Scanner; 
class Ass1_7 
{  
public static void main(String[] args)   
	{      
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int number = sc.nextInt();
		while (number>0)   
		{  
		int digit=number%10;  
		System.out.print(" ");  
		System.out.print(digit);  
		number=number/10;  
		}  
	}  
}  