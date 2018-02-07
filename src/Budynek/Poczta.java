/*
 * Author: Juliusz G¹secki
 * Description: Main class of project
 * Date:04.02.2018
 * 
 */
package Budynek;
import java.util.*;

import Interfejs.Interfejs;
import Transport.*;

public class Poczta {
	
	/*
	 * Glowna metoda obslugujaca glowna petle
	 */
	public void zarzadzaj()
	{
		Interfejs itf = new Interfejs(1);
		itf.initButtons();
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
	//	zp.wypiszID();
		int i=0;
		System.out.println(zp.iloscPojazdow());
warunek:		do {
			System.out.println("Co wyslac?");
			p.dodajPrzesylke(podajWage(in), 1, podajAdresata(str), podajNadawce(str), podajCel(str), "Lodz");
			p.pokazPrzesylke(i++);
			System.out.println("czy zakonczyc?");
			
			if(in.nextInt()==0)
			{
				p.showID();
				System.out.println("Dzisiejsza ilosc paczek to " + p.iloscPrzesylek());		
					for(Przewoz pojazd: zp.getPojazdy())
						{
							r.zaladuj(p.getPrzesylki(), pojazd);
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
