package defaultPackage;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

public class UserInput {

	static int timeChoice, daysCount, hoursCount, minutesCount;
	Calendar c = Calendar.getInstance();
	static Scanner input = new Scanner(System.in);

	public static void userInput() throws ParseException {
		System.out.println("Enter required Serial Number from below menu :\n");
		System.out.println("1. Logs from last few days\n2. Logs from last few hours\n3. Logs from last few minutes\n");
		timeChoice = input.nextInt();

		if (timeChoice == 1) {

			System.out.println("\nYou want logs for how many days?(1-5 days):\n");
			daysCount = input.nextInt();

			if (daysCount >= 1 && daysCount <= 5) {

				System.out.println("\nFetching logs for last " + daysCount + " days\n");
			}

			else {
				System.out.println("\nPlease enter days range between 1 to 5 only\n");
				userInput();
			}
		}

		else if (timeChoice == 2) {

			System.out.println("\nYou want logs for how many hours?(1-23 hours):\n");
			hoursCount = input.nextInt();
			if (hoursCount >= 1 && hoursCount <= 23) {
				System.out.println("\nFetching logs for last " + hoursCount + " hours\n");
			} else {
				System.out.println("\nPlease enter hours range between 1 to 23 only\n");
				userInput();
			}
		}

		else if (timeChoice == 3) {

			System.out.println("\nYou want logs for how many minutes?(1-59 minutes):\n");
			minutesCount = input.nextInt();
			if (minutesCount >= 1 && minutesCount <= 59) {
				System.out.println("\nFetching logs for last " + minutesCount + " minutes\n");
			} else {
				System.out.println("\nPlease enter minutes range between 1 to 59 only\n");
				userInput();
			}
		}

		else {

			System.out.println("\nPlease enter correct choice between 1 to 3 only...\n");
			userInput();
		}
	}
}
