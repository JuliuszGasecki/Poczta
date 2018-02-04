/*
 * Author: Juliusz G¹secki
 * Description: Main class of project
 * Date:04.02.2018
 * 
 */
package Budynek;

public class Poczta {
	
	public
	void zarzadzaj()
	{
	System.out.println("Witamy na poczcie");
		Punkt p = new Punkt();
		p.dodajList();
		p.dodajList();
		p.dodajList();
		p.dodajList();
		p.dodajList();
		p.dodajList();
		p.dodajList();
		p.dodajList();
		System.out.println("Dzisiejsza ilosc paczek to " + p.iloscPrzesylek());	
	}
	
	
	public static void main(String[] args)
	{
		Poczta p = new Poczta();
		p.zarzadzaj();
	}

}
