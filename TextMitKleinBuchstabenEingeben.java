/*Aufgabe 2. 
 * Schreiben Sie Programm, dass den Benutzer auffordert, eine e-mail - Adresse einzugeben 
 * und das anschlieﬂend die e-mail ñ Adresse komplett in Kleinbuchstaben ausgibt. */

package Aufgabe2;
import java.util.Scanner;

public class TextMitKleinBuchstabenEingeben {
	public static void main(String[] args) {
		
	Scanner Einleser = new Scanner(System.in);
	String Email = Einleser.nextLine();
	String NewEmail = Email.toLowerCase();
	System.out.println("Email Adresse mit Kleinbuchstaben: "+NewEmail);

}}
