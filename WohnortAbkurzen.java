/**Aufgabe 4.
 * *Schreiben Sie ein Programm, das die Benutzer zuerst auffordert,
 *  den Namen ihres Wohnorts einzugeben (z.B. „Donaueschingen“), danach nach einer Zahl fragt (z.B. 4), und zum 
 *  Schluss den Rest des Wohnortnamens ab der eingegebenen Zahl ermittelt. Dieser Restname soll dann ausgegeben werden. 
 *  Beispiel:  Der Benutzer gibt „Donaueschingen“ und 4 ein, dann soll das Programm die folgende 
 * Ausgabe machen: „Der Ortsname nach dem 4 Buchstaben heißt: ueschingen“ (Hinweis: der 4. Buchstabe gehört also nicht dazu!) **/

package Aufgabe4;
import java.util.Scanner;

public class WohnortAbkurzen {
public static void main(String[] args) {
	Scanner Einleser = new Scanner(System.in);
	System.out.println("geben Sie Ihre Wohnort ein: ");
	String Wohnort = Einleser.nextLine();
	System.out.println("Geben Sie den Zahl an: ");
	int Zahl = Einleser.nextInt();
	String WohnortName = Wohnort.substring(Zahl);
	
	System.out.println("Der Ortsname nach dem "+Zahl+" Buchstaben heißt: "+WohnortName);
}

}

