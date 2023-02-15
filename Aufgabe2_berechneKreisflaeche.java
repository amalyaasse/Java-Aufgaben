/*Programmieren Sie in der Klasse „Geometrischeformeln“ eine Methode, die die Fläche eines Kreises errechnet. 
 * Legen Sie dabei einen Radius von 5 cm zugrunde. Die Methode soll den Namen „berechneKreisflaeche()“ tragen.

Testen Sie in der Klasse „Startklasse“ die neu geschriebene Methode, in dem Sie die Methode dort in der main – Methode aufrufen.*/
package JavaMethoden;

import java.util.Scanner;

public class Aufgabe2_berechneKreisflaeche {
	public static void main(String[] args) {
		GeometrischeFormeln Kreis = new GeometrischeFormeln();
		Kreis.berechneKrisflaeche();
	}

	
	static class GeometrischeFormeln{
		public void berechneKrisflaeche(){
			System.out.println("Geben Sie Radius des Kreises  an: ");
			Scanner Einleser = new Scanner(System.in); 
			double Radius = Einleser.nextDouble();
			
			//int Seitenlange = 7;
			double Flaeche = Radius*Radius*3.14;
			
			System.out.println("Der Umfang des Dreicks beträgt: "+ Flaeche);
		}
	}
	}
