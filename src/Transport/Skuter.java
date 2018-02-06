/*
 * Author: Juliusz G¹secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Transport;

import Przesylka.*;

public class Skuter extends Ciezarowka{

	public Skuter(int ID, double cenaPaliwa, String cel) {
		super(cenaPaliwa,cel);
		this.ID = ID + 1000;
		this.ladownosc = 2;
		
	}
	
	@Override
	public boolean pobierzPrzesylke(Przesylka przesylka) {
		
		if(sprawdzCel(przesylka)&&przesylka instanceof Listt)
		{
		double waga=0;
		while(waga<=ladownosc)
		przesylki.add(przesylka);
		waga+=przesylka.getWaga();
		return true;
		}
		return false;
			
	}
}
