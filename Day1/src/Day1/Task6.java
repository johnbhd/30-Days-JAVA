package Day1;
import javax.swing.JOptionPane;

public class Task6 {
	public static void main(String[] args) {
		String name;
		
		name = JOptionPane.showInputDialog("Enter Name: "); // Get Input
		
		JOptionPane.showMessageDialog(null, "Hi "+name); // Show Input
	}	
}
