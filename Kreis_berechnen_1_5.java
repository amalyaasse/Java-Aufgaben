/*Schreiben Sie ein �bersichtliches und leicht lesbares Programm, 
das f�r den Radius 48 den Umfang und die Fl�che des dazugeh�rigen 
Kreises berechnet (Hinweis: Pi = 3.1415).Seite  von 33
 **/

package Variabeln_in_java;

public class Kreis_berechnen_1_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variabeln initialisieren
		int Radius = 48;
		double Pi = 3.1415;
		double Fl�che=0;
		double Umfang=0;
		// berechnung der Fl�che
		Fl�che = Pi * Radius * Radius;
		Umfang = 2 * Pi * Radius;
		//Ausgabe
		System.out.println("Die Fl�che des Kreises betr�gt " +Fl�che +"Qcm");
		System.out.println("Der Umfang des Kreises betr�gt " +Umfang +"Cm");
	}

}
