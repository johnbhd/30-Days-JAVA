package Day2;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Enter First Number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		num2 = input.nextInt();
		
		num1 = num1 ^ num2; // num1 now holds (num1 ^ num2)
		num2 = num1 ^ num2; // num2 becomes original num1
		num1 = num1 ^ num2; // num1 becomes original num2

		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
	}
}
