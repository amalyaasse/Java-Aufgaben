/*Legen Sie ein ganz neues Java ñ Projekt mit dem Namen ÑKaufmannsrechnerì an. Erstellen Sie in diesem Projekt eine Klasse ÑKaufmaennischeFormelnì.

Programmieren Sie danach in der Klasse ÑKaufmaennischeFormelnì eine Methode zur Ermittlung des Bruttopreises. 
Dabei geht die Methode von einem Artikel ñ Nettopreis von 100 Ä aus und errechnet dann auf Basis eines Mehrwertsteuersatzes von 19% den Bruttopreis des Artikels. Anschlieﬂend gibt die Methode den errechneten Bruttopreis auf dem Bildschirm aus. Die Methode soll den Namen ÑberechneBruttopreis()ì
 tragen und anschlieﬂend in einer Klasse mit einer main ñ Methode (ÑStartklasseì) benutzt werden.*/
package Aufgabe3_;
import java.util.Scanner;

public class KaufmaennischeFormeln {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		berechneBruttopreis();
		
		

	}
	
	static void berechneBruttopreis(){
		System.out.println("Geben Sie Nettopreis an:");
		Scanner Einleser = new Scanner(System.in);
		int Nettopreis = Einleser.nextInt();
		double Bruttopreis = Nettopreis*0.19 +Nettopreis;
		System.out.println("Bruttopreis: "+Bruttopreis);
	}

}
