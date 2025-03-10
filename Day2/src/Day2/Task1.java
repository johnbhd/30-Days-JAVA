package Day2;
import java.util.Scanner;
/*
Day 2: Operators & Expressions
1️⃣ Perform arithmetic operations (+, -, *, /, %)
2️⃣ Find the largest of three numbers using ternary operator
3️⃣ Check if a number is even or odd
4️⃣ Swap two numbers using bitwise XOR
5️⃣ Convert lowercase letters to uppercase and vice versa
 */

public class Task1 {
	
	static int Myfunc(int num1, int num2, char op) {
		int result = 0;
		switch (op) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			default: 
				System.out.println("Invalid operator.");
				break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, result;
		char op;
		
		System.out.print("Enter First Number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		num2 = input.nextInt();
		
		System.out.print("Enter Operator(+, -, *, /): ");
		op = input.next().charAt(0);
		
		result = Myfunc(num1, num2, op);
		System.out.println("Result: "+result);
		input.close();
	}
}
