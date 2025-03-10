package Day2;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word, result;
		char ch;
		
		System.out.print("Enter Word: ");
		word = input.nextLine();
		
		System.out.print("Choose Lowercase(L) or Uppercase(U): ");
		ch = input.next().charAt(0);
		
		result = (ch == 'L' || ch == 'l') ? word.toLowerCase() : (ch == 'U' || ch == 'u') ? word.toUpperCase() : "Invalid";
		
		System.out.println(result);
		
	}
}
