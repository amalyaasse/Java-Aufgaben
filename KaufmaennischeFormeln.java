/*Legen Sie ein ganz neues Java � Projekt mit dem Namen �Kaufmannsrechner� an. Erstellen Sie in diesem Projekt eine Klasse �KaufmaennischeFormeln�.

Programmieren Sie danach in der Klasse �KaufmaennischeFormeln� eine Methode zur Ermittlung des Bruttopreises. 
Dabei geht die Methode von einem Artikel � Nettopreis von 100 � aus und errechnet dann auf Basis eines Mehrwertsteuersatzes von 19% den Bruttopreis des Artikels. Anschlie�end gibt die Methode den errechneten Bruttopreis auf dem Bildschirm aus. Die Methode soll den Namen �berechneBruttopreis()�
 tragen und anschlie�end in einer Klasse mit einer main � Methode (�Startklasse�) benutzt werden.*/
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
