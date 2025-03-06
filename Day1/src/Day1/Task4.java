package Day1;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner
		String name;
		
		System.out.print("Enter your name: ");
		name = input.nextLine(); // read user input
		
		System.out.println("Hello "+name); // print name
		
		input.close();
	}
}
