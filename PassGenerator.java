/*Aufgabe 4: Passwort – Generierung I Schreiben Sie ein Programm, 
 * das automatisch für alle Benutzer ein Passwort erzeugt. Das Passwort besteht aus den ersten und letzten Buchstaben von 
 * Vor- und Nachname der Benutzer sowie ihrem Alter. Alle Buchstaben sind groß geschrieben. Zu diesem Zweck erfragt das Programm von den
 *  Benutzern den Vor- und den Nachnamen sowie das Alter und gibt nach der Generierung des Passworts das Passwort am Bildschirm aus.
 *  Beispiel: Aus Angela Merkel mit dem Alter 53 ergibt sich das Passwort:   AAML53
*/

package GemischteUbungenAufgabe1ab;
import java.util.Scanner;

public class PassGenerator {
	public static void main(String[] args) {
		
		Scanner Einleser = new Scanner(System.in);
		
		System.out.println("Geben Sie Ihre Vorname an: ");
		String Vorname = Einleser.nextLine();
		System.out.println("Geben Sie Ihre Name an: ");
		String Name = Einleser.nextLine();
		System.out.println("Geben Sie Ihre Alter an: ");
		int alter = Einleser.nextInt();
		
		// Passwort generirung
		int x = Vorname.length();
		int y = Name.length();
				String AName = Name.substring(0,1).toUpperCase();
				String EndName = Name.substring(y-1,y).toUpperCase();
				String AVorname = Vorname.substring(0,1).toUpperCase();
				String EVorname = Name.substring(x-1,x).toUpperCase();
		System.out.println("Ich schlage die folgende Passwort für Sie vor: "+AVorname+EVorname+AName+EndName+alter);
	}

}
