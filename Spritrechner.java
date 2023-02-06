package Hausaufgaben;
import java.util.Scanner;

/**
 * Schreiben Sie ein Programm (Projektname „Spritrechner“), das die Benutzer zunächst nach den
 *  gefahrenen Kilometern fragt, danach nach der dabei verbrauchten Benzinmenge (in Litern) und daraus den
 *   Verbrauch in Liter pro 100 km errechnet. Das Ergebnis soll dann
 *  in z.B. in der Form „Sie haben 5.21 li /100 km verbraucht!“ auf dem Bildschirm ausgegeben werden
 * */
public class Spritrechner {
	
	public static void main(String args[]) {
		
	Scanner Einleser = new Scanner (System.in);
	int Km = Einleser.nextInt();
	int BenzinMenge = Einleser.nextInt();
	
	
	System.out.println( "Sie haben für 100km " + BenzinMenge*100/Km + " Liter Benzin verbraucht");
	

}}
