package Day2;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Enter First Number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		num2 = input.nextInt();
		
		System.out.println("num1 & num2 = "+ (num1 & num2));
		System.out.println("num1 | num2 = "+(num1 | num2));
		System.out.println("num1 ^ num2 = "+(num1 ^ num2));
	}
}
