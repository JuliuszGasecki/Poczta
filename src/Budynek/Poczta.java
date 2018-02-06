/*
 * Author: Juliusz G�secki
 * Description: Main class of project
 * Date:04.02.2018
 * 
 */
package Budynek;
import java.util.*;
import Transport.*;

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
		Rozdzielnia r = new Rozdzielnia();
		ZarzadzniePojazdami zp = new ZarzadzniePojazdami();
		zp.dodajCiezarowke("Berlin");
		zp.dodajCiezarowke("Tokio");
		zp.dodajSkuter("Lodz");
		zp.dodajSamolot("Rio");
		System.out.println(zp.iloscPojazdow());
warunek:		do {
			System.out.println("Co wyslac?");
			p.dodajPrzesylke(podajWage(in), 1, podajAdresata(str), podajNadawce(str), podajCel(str), "Lodz");
			System.out.println("czy zakonczyc?");
			
			if(in.nextInt()==0)
			{
				p.showID();
				System.out.println("Dzisiejsza ilosc paczek to " + p.iloscPrzesylek());		
					for(int i = 0 ; i < zp.iloscPojazdow() ; i++)
						{
							r.zaladuj(p.getPrzesylki(), zp.getPojazd(i));
						}
				System.out.println("Dzisiejsza ilosc paczek to " + p.iloscPrzesylek());
				break warunek;
			}
		}while(true);
		
		
		p.showID();
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
		System.out.print("Koniec");
	}

}
