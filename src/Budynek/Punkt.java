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
import java.util.ArrayList;

public class Punkt {
	
	/*
	 * 
	 * Lista przesylek przyjmujaca przesylki
	 * Miasto - zmienna ktora sluzy do obliczania odleglosci
	 * mapa zawiera metode odliczajaca odleglosc
	 * 
	 */
	List<Przesylka> przesylki ;
	String miasto;
	Mapa mapa;
	
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
	void dodajList()
	{
		Listt list = new Listt(1, 1, 1, "Lodz", "LOL", "LOl");
			przesylki.add(list);
		System.out.println("Dodano list :D");
		System.out.println("Cena to :" + obliczCene("Lodz", "Berlin"));
	}
	
	
	/*
	 * Metoda zwracajca ilosc przesylek czekajacych na wyjazd
	 */
	int iloscPrzesylek()
	{
		return przesylki.size();
	}
	
	/*
	 * 
	 * Metoda oblcizajaca cene za wyslanie paczki
	 * 
	 */
	double obliczCene(String miastoPoczatkowe, String miastoKoncowe)
	{

	//	System.out.println("Odleglosc to :" +  mapa.wybierzMiasto(miastoPoczatkowe, miastoKoncowe));
		return przesylki.get(przesylki.size()-1).setCena( mapa.wybierzMiasto(miastoPoczatkowe, miastoKoncowe) );
	}
	
	

}
