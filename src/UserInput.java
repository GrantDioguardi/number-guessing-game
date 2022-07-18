import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {

	private Scanner keyboard = new Scanner(System.in);
	
	public int inputInteger() {
		int integer = 0;
		
		boolean invalidInput = true;
		do {
			try {
				integer = Integer.valueOf(keyboard.nextLine());
				invalidInput = false;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid input: Only enter integer values.");
			}
		} while (invalidInput);
		
		return integer;
	}
	
	public String inputString() {
		
		// TODO Take user input.
		
		return "";
	}
}
