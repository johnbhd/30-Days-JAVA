package Day1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String name;
		
		System.out.print("Enter your Name: ");
		name = input.readLine();
		
		System.out.println("Nice to meet you "+name);
	}
}
