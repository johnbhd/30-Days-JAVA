package Day2;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter Number: ");
		num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
	}
}
