/*Aufgabe 3.
 * Schreiben Sie ein Programm, dass den Benutzer auffordert, eine frei w‰hlbare web ñ Domain 
 * (z.B. www.meinname.de) einzugeben und das anschlieﬂend diese Domain ohne Leerzeichen am
 *  Ende oder vor der Domain ausgibt, auch wenn der Benutzer ein oder mehrere
 *   Leerzeichen vor oder nach der Domain eingegeben hat.**/
package Aufgabe3;
import java.util.Scanner;

public class DomeinAusgeben {
	public static void main(String[] args){
		Scanner Einleser = new Scanner(System.in);
		String Domein = Einleser.nextLine();
		String NewDomein = Domein.trim() ;
		System.out.println("Domein ohne Leerzeichen: "+NewDomein);
		
		
	}

}
