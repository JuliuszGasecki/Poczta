/*
 * Author: Juliusz G¹secki
 * Description: Main class of project
 * Date:04.02.2018
 * 
 */
package Budynek;
import java.util.*;

public class Poczta {
	
	/*
	 * Glowna metoda obslugujaca glowna petle
	 */
	public void zarzadzaj()
	{
		Scanner in = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
	System.out.println("Witamy na poczcie");
		Punkt p = new Punkt();
warunek:		do {
			System.out.println("Co wyslac?");
			p.dodajPrzesylke(podajWage(in), 1, podajAdresata(str), podajNadawce(str), podajCel(str), "Lodz");
			System.out.println("czy zakonczyc?");
			if(in.nextInt()==0)
			break warunek;
		}while(true);
		
		System.out.println("Dzisiejsza ilosc paczek to " + p.iloscPrzesylek());	
	}
	
	/*
	 * Skanowanie wagi
	 */
		
	double podajWage(Scanner a)
	{
		System.out.println("Podaj wage: ");
		double b=a.nextDouble();
		return 	b;	
	}
	
	/*
	 * Skanowanie adresata
	 */
	String podajAdresata(Scanner a)
	{
		System.out.println("Podaj adresata: ");
		String b=a.nextLine();
		return b;	
	}
	/*
	 * Skanowanie nadawcy
	 */
	String podajNadawce(Scanner a)
	{
		System.out.println("Podaj nadawce: ");
		String b=a.nextLine();
		return b;	
	}
	/*
	 * Skanowanie miasta docelowego
	 */
	String podajCel(Scanner a)
	{
		System.out.println("Podaj do jakiego miasta: ");
		String b=a.nextLine();
		return b;	
	}	
	
	
	/*
	 * 
	 * Main!!!
	 * 
	 */
	public static void main(String[] args)
	{
		Poczta p = new Poczta();
		p.zarzadzaj();
	}

}
