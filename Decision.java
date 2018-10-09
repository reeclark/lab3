package lab3;

import java.util.Scanner;

public class Decision {
	public static void main(String[] args) {
		// Declare variables.
		Scanner input = new Scanner(System.in);
		String cont = "", name = "";
		int number;

		// Get user name.
		do {
			System.out.println("Enter your first name: ");
			input.hasNextLine();
			name = input.nextLine();

			// Get use number while checking for correct entry.
			while (true) {
				System.out.println("Hi " + name + "! Enter a number between 1 and 100: ");
				input.hasNextInt();
				number = input.nextInt();

				// Check for valid number.
				if (number < 1) {
					System.out.println(name + "! That number is less than 1!");
				} else if (number > 100) {
					System.out.println(name + "! That number is greater than 100!");
				} else {
					break;
				}
			}

			// Display output.
			if (((number % 2) != 0) && number <= 59) {
				System.out.println(name + "! Your number: " + number + " and Odd");
			} else if ((number % 2) == 0 && (number == 2 || number <= 25)) {
				System.out.println(name + "! Your number: " + number + ", even and less than 25");
			} else if ((number % 2) == 0 && (number == 26 || number <= 60)) {
				System.out.println(name + "! Your number was: Even");
			} else if ((number % 2) == 0 && number > 60) {
				System.out.println(name + "! Your number: " + number + " Even");
			} else if (((number % 2) != 0) && number > 60) {
				System.out.println(name + " Your number: " + number + ", Odd and over 60");
			}

			// Ask to continue.
			System.out.println("Continue? (y/n): ");
			input.nextLine();
			cont = input.nextLine();

		} while (cont.equalsIgnoreCase("y"));
		System.out.println("Bye!");
		input.close();
	}
}

/*
 * Sources: https://www.tutorialspoint.com/java/java_basic_operators.htm
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 * https://learn.zybooks.com/zybook/GRANDCIRCUSJAVAAY2018/chapter/3/section/1
 */