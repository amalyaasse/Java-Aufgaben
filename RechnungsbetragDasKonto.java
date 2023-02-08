/***Aufgabe 1a Erstellen Sie ein Programm, das für einen Rechnungsbetrag von € 1980,- das Skonto in Höhe von 2% errechnet 
 * und ausgibt.Aufgabe 1b Erweitern Sie das Programm aus Aufgabe 1a so ab, dass es den Benutzer nach dem Rechnungsbetrag fragt, für 
 * diesen eingegebenen Betrag das Skonto errechnet und diesen Betrag mit einer passenden Meldung ausgibt.*****/

package GemischteUbungenAufgabe1ab;
import java.util.Scanner;


public class RechnungsbetragDasKonto {
public static void main(String[] args) {

	//Aufgabe 1a
	 float Betrag1 = (float) (1980 + 1980*0.02);
	System.out.println("Die lösung für Aufgabe 1a");
	System.out.println("Rechnungsbetrag von 1980 Euro unter 2 % ist:  "+Betrag1);
	System.out.println("---------------------------------------------------------------------");
	
	//Aufgabe 1b
	System.out.println("Die lösung für Aufgabe 1b");
	
	Scanner Einleser = new Scanner(System.in);
	System.out.println("Jetzt geben Sie Ihre gewünschte Betrag ein: ");
	float Betrag2 = Einleser.nextFloat(); // Gewünschte Betrag
	float Endbetrag = (float)(Betrag2 + Betrag2*0.02);
	System.out.println("Rechnungsbetrag von "+Betrag2+" beträgt auf "+Endbetrag+ " Euro");
	
	

}
}
