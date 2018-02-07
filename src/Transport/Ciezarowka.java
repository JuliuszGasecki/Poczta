/**
 * @author: Juliusz G¹secki
 * Description: 
 * @date: 04.02.2018
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
	final double cenaKierowcy; //NA GODZINE
	final double kilometryGodzina;
	final double kosztyWlasne; //za przewoz
	
	
	public Ciezarowka(int ID, double cenaPaliwa,String cel)
	{
		this.ID= ID + 2000;
		this.cenaPaliwa = cenaPaliwa/10;
		this.ladownosc = 300;
		this.cel = cel;
		this.przesylki = new ArrayList<>();
		this.wTrasie = false;
		this.cenaKierowcy = 20;
		this.kilometryGodzina = 70;
		this.kosztyWlasne = 300;
		
	}
	
	public Ciezarowka(double cenaPaliwa,String cel, double cenaKierowcy, double kilometryGodzina, double koszty)
	{
		this.cenaPaliwa = cenaPaliwa;
		this.cel = cel;
		this.przesylki = new ArrayList<>();
		this.wTrasie = false;
		this.cenaKierowcy = cenaKierowcy;
		this.kilometryGodzina = kilometryGodzina;
		this.kosztyWlasne = koszty;
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
