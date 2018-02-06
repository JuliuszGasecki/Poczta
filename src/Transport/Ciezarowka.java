/*
 * Author: Juliusz G¹secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Transport;
import Przesylka.*;
import java.util.ArrayList;
import java.util.List;

public class Ciezarowka implements Przewoz{
	
	int ID;
	double cenaPaliwa;
	double ladownosc;
	String cel;
	List<Przesylka> przesylki;
	boolean wTrasie;
	
	
	public Ciezarowka(int ID, double cenaPaliwa, double ladownosc,String cel)
	{
		this.ID= ID + 2000;
		this.cenaPaliwa = cenaPaliwa;
		this.ladownosc = ladownosc;
		this.cel = cel;
		this.przesylki = new ArrayList<>();
		this.wTrasie = false;
	}
	
	public Ciezarowka(double cenaPaliwa, double ladownosc,String cel)
	{
		this.cenaPaliwa = cenaPaliwa;
		this.ladownosc = ladownosc;
		this.cel = cel;
		this.przesylki = new ArrayList<>();
		this.wTrasie = false;
	}

	@Override
	public boolean pobierzPrzesylke(Przesylka przesylka) {
		
		if(sprawdzCel(przesylka))
		{
		double waga=0;
		while(waga<=ladownosc)
		przesylki.add(przesylka);
		waga+=przesylka.getWaga();
		return true;
		}
		return false;
			
	}

	@Override
	public void zawiez() {	
		this.wTrasie=true;
	}

	@Override
	public double naliczCenePrzewozu(double odleglosc) {
		
		return 0;
	}

	@Override
	public boolean sprawdzCel(Przesylka przesylka) {
	if(przesylka.getMiasto().equals(cel))
		return true;
	return false;
	}
	
	

}
