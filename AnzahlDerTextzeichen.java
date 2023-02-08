/**Aufgabe 1.
 * Schreiben Sie ein Programm, das den Nutzer nach einem beliebigen Text fragt und 
 * anschlieﬂend auf dem Bildschirm
 *  eine Meldung mit dem folgenden Muster ausgibt: ÑIhr Text enth‰lt 28 Zeichen.ì **/

package VerarbeitungVonStrings;
import java.util.Scanner;

public class AnzahlDerTextzeichen {
	
	public static void main(String[] args) {
		
		Scanner Einleser = new Scanner(System.in);
		String BelibigeText = Einleser.nextLine();
		int x = BelibigeText.length();
		
		System.out.println("Ihre Text enth‰lt "+x+ " Zeichen");
		
	}
	
	

}
