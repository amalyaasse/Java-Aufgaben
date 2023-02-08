/*Schreiben Sie ein übersichtliches und leicht lesbares Programm, 
das für den Radius 48 den Umfang und die Fläche des dazugehörigen 
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
		double Fläche=0;
		double Umfang=0;
		// berechnung der Fläche
		Fläche = Pi * Radius * Radius;
		Umfang = 2 * Pi * Radius;
		//Ausgabe
		System.out.println("Die Fläche des Kreises beträgt " +Fläche +"Qcm");
		System.out.println("Der Umfang des Kreises beträgt " +Umfang +"Cm");
	}

}
