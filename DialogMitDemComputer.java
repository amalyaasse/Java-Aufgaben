/*//Aufgabe 3: Dialog mit dem Computer Schreiben Sie ein Programm, das auf dem Bildschirm die Meldung 
�Hallo, mein Name ist Hal!� ausgibt. Dann soll das Programm die User in einer neuen Zeile nach ihrem Namen fragen (�Wie hei�t Du?�) 
und die Antwort der User entgegennehmen. Auf die User � Eingabe antwortet das Programm mit �Hallo (User-Name), sch�n Dich zu treffen!�. 
Anschlie�end soll das Programm die User in einer neuen Zeile fragen: �Was kann ich f�r Dich tun?�, wobei die User nun ihre 
W�nsche eingeben k�nnen. Zum Abschluss soll das Programm die Antwort geben: �Tut mir leid, (User-Name). Das kann ich nicht tun!�.*///


package GemischteUbungenAufgabe1ab;
import java.util.Scanner;

public class DialogMitDemComputer {
	public static void main(String[] args) {
		System.out.println("Hallo, mein Name ist Rabitt3034");
		System.out.println("und wie hei�t du: ");
		Scanner Einleser = new Scanner(System.in);
		String Antwort1 = Einleser.nextLine();
		System.out.println("Hallo "+Antwort1+" sch�n dich zu treffen");
		System.out.println("Was kann ich f�r Sie tun? ");
		String Antwort2 = Einleser.nextLine();
		System.out.println("tut mir leid "+ Antwort1+". Das kann ich nicht tun ");
	}

}
