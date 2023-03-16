package uebung01;

import static pr.MakeItSimple.println;
import static pr.MakeItSimple.readInt;

public class BloodAlcoholContent {
	public static void main(String[] args) {
		println("Gebe Masse des aufgenommen Alkohols in Gramm (g, ganzzahlig) an: ");
		int a = readInt(); // Eingabe wird gleich "a" gesetzt (wobei "a" ganzahlig ist).

		println("Gebe Masse der Person in Kilogram (kg, ganzzahlig) an: ");
		int m = readInt(); // Eingabe wird gleich "m" gesetzt (wobei "m" ganzahlig ist).

		println("Gebe Geschlecht der Person (0 -> Frau, 1 -> Mann) an: ");
		int gender = readInt(); // Eingabe wird gleich "gender" gesetzt (wobei "gender" ganzahlig ist).

		double r = 0; // "r" wird initalisiert als double um sog. "fractional numbers" als Wert
						// annehmen zu können.

		if (gender == 0) { // Wenn das Geschlecht "0" -> Frau ist.
			r = 0.6;

			double w = a / (m * r); // Formel wird mit allen vorher eingelesenen Variablen angewendet.

			println("Die Blutalkoholkonzentration beträgt: " + w + " Promille, Widmark-Formel.");
		} else if (gender == 1) { // Wenn das Geschlecht "1" -> Mann ist.
			r = 0.7;

			double w = a / (m * r); // Formel wird mit allen vorher eingelesenen Variablen angewendet.

			println("Die Blutalkoholkonzentration beträgt: " + w + " Promille, Widmark-Formel.");
		} else { // Wenn das Geschlecht alles andere als "0" oder "1" -> nicht Frau oder Mann
			// ist.
			println("Geschlecht ungültig!");
		}

		// Nutzung von "return;" wird durch die Berechnung nach den "gender == 0/1"
		// Abfragen umgangen.

	}
}