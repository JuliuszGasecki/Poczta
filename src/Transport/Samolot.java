/*
 * Author: Juliusz G¹secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Transport;

import java.util.ArrayList;
import java.util.List;

import Przesylka.Przesylka;

public class Samolot implements Przewoz{
	
	int ID;
	double cenaPaliwa;
	double ladownosc;
	String cel;
	List<Przesylka> przesylki;
	boolean wTrasie;
	final double cenaKierowcy = 100; //NA GODZINE
	final double kilometryGodzina = 600;
	final double kosztyWlasne = 2000; //za lot
	
	public Samolot(int ID, double cenaPaliwa,String cel)
	{
		this.ID= ID + 3000;
		this.cenaPaliwa = cenaPaliwa/ 200;
		this.ladownosc = 600;
		this.cel = cel;
		this.przesylki = new ArrayList<>();
		this.wTrasie = false;
	}
	

	@Override
	public boolean pobierzPrzesylke(Przesylka przesylka) {
		
		if(sprawdzCel(przesylka))
		{
		przesylki.add(przesylka);
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
		
		return odleglosc * kilometryGodzina* cenaPaliwa * cenaKierowcy + kosztyWlasne;
	}

	@Override
	public boolean sprawdzCel(Przesylka przesylka) {
	if(przesylka.getMiasto().equals(cel))
		return true;
	return false;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public double getCenaPaliwa() {
		return cenaPaliwa;
	}


	public void setCenaPaliwa(double cenaPaliwa) {
		this.cenaPaliwa = cenaPaliwa;
	}


	public double getLadownosc() {
		return ladownosc;
	}


	public void setLadownosc(double ladownosc) {
		this.ladownosc = ladownosc;
	}


	public String getCel() {
		return cel;
	}


	public void setCel(String cel) {
		this.cel = cel;
	}


	public List<Przesylka> getPrzesylki() {
		return przesylki;
	}


	public void setPrzesylki(List<Przesylka> przesylki) {
		this.przesylki = przesylki;
	}


	public boolean iswTrasie() {
		return wTrasie;
	}


	public void setwTrasie(boolean wTrasie) {
		this.wTrasie = wTrasie;
	}


	public double getCenaKierowcy() {
		return cenaKierowcy;
	}


	public double getKilometryGodzina() {
		return kilometryGodzina;
	}


	public double getKosztyWlasne() {
		return kosztyWlasne;
	}
	
	

}
