package Day2;
import java.util.Scanner;

public class Task2 {
	static int myFunc(int num1, int num2, int num3) {
		int highest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
		System.out.println("Highest number: "+ highest);
		
		return highest;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Enter First Number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		num2 = input.nextInt();
		
		System.out.print("Enter Third Number: ");
		num3 = input.nextInt();
		
		int result = myFunc(num1, num2, num3);
		System.out.println("Result: "+result);
		
	}
}
