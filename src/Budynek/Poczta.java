package Budynek;

public class Poczta {
	
	public
	void zarzadzaj()
	{
	System.out.println("Witamy na poczcie");
		Punkt p = new Punkt();
		p.dodajList();
		System.out.println("Dzisiejsza ilosc paczek to " + p.iloscPrzesylek());	
	}
	
	
	public static void main(String[] args)
	{
		Poczta p = new Poczta();
		p.zarzadzaj();
	}

}
