import java.util.Scanner;
class Ass1_9 {
 
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter no");
		int num = sc.nextInt();
        //find all factors
        for(int i = 1; i <= num; ++i) {
            //check if i is a factor of num
            if(num % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}