package Day1;

public class Task3 {
	public static void main(String[] args) {
		int a = 5, b = 10;
		
		a = a + b; // 15
		b = a - b; // 5
		a = a - b; // 10
		
		System.out.println("Swap Value of A: "+a);
		System.out.println("Swap Value of B: "+b);
	}
}
