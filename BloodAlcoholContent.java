package BloodAlcoholContent;

public class BloodAlcoholContent {
	public static void main(String[] args) {
		System.out.println("Specify mass of alcohol absorbed in grams (g, integer): ");
		int a = Integer.parseInt(System.console().readLine()); // Input is set equal to "a" (where "a" is integer).

		System.out.println("Specify mass of the person in kilograms (kg, integer): ");
		int m = Integer.parseInt(System.console().readLine()); // Input is set equal to "m" (where "m" is integer).

		System.out.println("Specify gender of the person (0 -> woman, 1 -> man): ");
		int gender = Integer.parseInt(System.console().readLine()); // Input is set equal to "gender" (where "gender" is integer).

		double r = 0; // r" is initialized as a double to accept fractional numbers as value.

		if (gender == 0) { // If the gender is "0" -> woman.
			r = 0.6;

			double w = a / (m * r); // Formula is applied with all previously read variables.

			System.out.println("The blood alcohol concentration is: " + w + " per mille, Widmark formula.");
		} else if (gender == 1) { // If the gender is "1" -> man.
			r = 0.7;

			double w = a / (m * r); // Formula is applied with all previously read variables.

			System.out.println("The blood alcohol concentration is: " + w + " per mille, Widmark formula.");
		} else { // If the gender is anything other than "0" or "1" -> not woman or man.
			System.out.println("Gender invalid!");
		}

		// Use of "return;" is bypassed by the calculation after the "gender == 0/1" queries.
	}
}
