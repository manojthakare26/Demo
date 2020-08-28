package defaultPackage;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) {
		
		try {
			UserInput.userInput();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
