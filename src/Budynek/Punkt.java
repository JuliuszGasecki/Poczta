/*
 * Author: Juliusz G¹secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Budynek;
import Przesylka.*;
import Mapa.*;
import java.util.List;
//import java.util.Scanner;
import java.util.ArrayList;

public class Punkt {
	
	/* 
	 * Lista przesylek przyjmujaca przesylki
	 * Miasto - zmienna ktora sluzy do obliczania odleglosci
	 * mapa zawiera metode odliczajaca odleglosc
	 */
	List<Przesylka> przesylki ;
	String miasto;
	Mapa mapa;
	static int nextID = 0;
	
	public
	/*
	 * Konstruktor domyslny Punktu przyjmowania przesylek
	 */
	Punkt()
	{
		przesylki = new ArrayList<Przesylka>();
		this.miasto = "Lodz";								
		this.mapa = new Mapa();
		
	}
	
	/*
	 * Metoda do dodawania listu do LISTY przesylek
	 */
	public void dodajPrzesylke(double waga, int rozmiar, String adresat, String imie, String adres, String nadanie)
	{
		
		if(czyList(waga) == 1)
		{	
			przesylki.add(new Paczka(++nextID, waga, rozmiar, adresat, imie, adres));
			System.out.println("Dodano paczke");
		}
	else if(czyList(waga) == 2)
	{
			przesylki.add(new Listt(++nextID, waga, rozmiar, adresat, imie, adres));
			System.out.println("Dodano list");
	}
	else if (czyList(waga) == -1)
		System.out.println("blad");
		
		przesylki.get(przesylki.size()-1).setMiastoNadania(nadanie);
		
		System.out.println("Cena to :" + obliczCene(nadanie, adres));
	}
	
	
/*
 * Sprawdza czy waga czy paczka
 */
	int czyList(double waga)
	{
		if(waga>=0.5)
			return 1;
		else if	(waga<0.5)
			return 2;
		else 
			return -1;
	}
	
	
	/*
	 * Metoda zwracajca ilosc przesylek czekajacych na wyjazd
	 */
	int iloscPrzesylek()
	{
		return przesylki.size();
	}
	
	/*
	 * Metoda oblcizajaca cene za wyslanie paczki
	 */
	double obliczCene(String miastoPoczatkowe, String miastoKoncowe)
	{

		//System.out.println("Odleglosc to :" +  mapa.wybierzMiasto(miastoPoczatkowe, miastoKoncowe));
		return przesylki.get(przesylki.size()-1).setCena( mapa.wybierzMiasto(miastoPoczatkowe, miastoKoncowe) );
	}
	
	public void showID()
	{
		for(Przesylka p: przesylki)
			System.out.print(p.getID() + " ");
		System.out.println();
	}

	public List<Przesylka> getPrzesylki() {
		return przesylki;
	}

	public void setPrzesylki(List<Przesylka> przesylki) {
		this.przesylki = przesylki;
	}
	
	public void pokazPrzesylke(int i)
	{
		System.out.println(przesylki.get(i));
	}
	
	
	

}
