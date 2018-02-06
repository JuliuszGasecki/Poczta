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
		super(cenaPaliwa,cel, 16, 40, 50); //No i super kurwo 
		this.ID = ID + 1000;
		this.ladownosc = 2;
		
	}
	
	@Override
	public boolean pobierzPrzesylke(Przesylka przesylka) {
		
		if(sprawdzCel(przesylka)&&przesylka instanceof Listt)
		{
		przesylki.add(przesylka);
		return true;
		}
		return false;
			
	}
	@Override
	public double naliczCenePrzewozu(double odleglosc) {
		
		return  cenaKierowcy + kosztyWlasne;
	}

}
