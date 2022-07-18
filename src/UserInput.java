import java.util.Scanner;
import java.lang.NumberFormatException;

public class UserInput {

	private Scanner keyboard = new Scanner(System.in);
	
	public int inputInteger(String prompt) {
		int integer = 0;
		
		// Continue to accept input until users enter an integer.
		boolean invalidInput = true;
		do {
			try {
				System.out.print(prompt);
				integer = Integer.valueOf(keyboard.nextLine());
				invalidInput = false;
			} catch (NumberFormatException nme) {
				System.out.println("Invalid input: Only integers accepted.");
			}
		} while (invalidInput);
		
		return integer;
	}
	
	public String inputString(String prompt) {
		System.out.print(prompt);
		return keyboard.nextLine();
	}
}
