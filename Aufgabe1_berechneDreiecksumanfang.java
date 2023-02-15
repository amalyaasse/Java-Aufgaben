/*Programmieren Sie in der Klasse „Geometrischeformeln“ eine Methode, die 
 * den Dreiecksumfang eines gleichseitiges Dreiecks erfragt und von einer Seitenlänge von 7 cm ausgeht. Die Methode soll 
 * den Namen „berechneDreiecksumfang()“ tragen.

Testen Sie in der Klasse „Startklasse“ die neu geschriebene Methode, in dem Sie die Methode dort in der main – Methode aufrufen.*/

package JavaMethoden;
import java.util.Scanner;

public class Aufgabe1_berechneDreiecksumanfang {
	
	public static void main(String[] args) {
		
		GeometrischeFormeln Dreieck = new GeometrischeFormeln();
		Dreieck.berechneDreicksumfang();
		
	}
	
	 static class GeometrischeFormeln{
		public void berechneDreicksumfang(){
			System.out.println("Geben Sie seitenlange des Dreiecks an: ");
			Scanner Einleser = new Scanner(System.in); 
			int Seitenlange = Einleser.nextInt();
			
			//int Seitenlange = 7;
			int Umfang = 3*Seitenlange;
			
			System.out.println("Der Umfang des Dreicks beträgt: "+Umfang);
		}
	}

}
