/*
 * Author: Juliusz G¹secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Przesylka;

public class Przesylka {
	
	protected
	int ID;
	double waga;
	int rozmiar;
	String adresat;
	String nadawca;
	String miasto;
	String miastoNadania;
	boolean typ;
	double cena;
	
	public Przesylka(int ID, double waga, int rozmiar, String adresat, String nadawca, String miasto)
	{
		this.ID = ID;
		this.waga= waga;
		this.rozmiar = rozmiar;
		this.adresat = adresat;
		this.nadawca = nadawca;
		this.miasto = miasto;
	}
	
	void setTyp(boolean typ)
	{
		this.typ = typ;
	}
	
	public double setCena(double odleglosc)
	{
		if(typ = true)
		{
			switch(rozmiar)
			{
			case 1:
				this.cena =  waga * odleglosc * 0.01;
				break;
			case 2:
				this.cena =  waga * odleglosc * 0.015;
				break;
			case 3:
				this.cena =  waga * odleglosc * 0.02;
				break;
				default :
					this.cena = -1;
					break;
					
			}
			
		}
		else if(typ ==false)
		{
			switch(rozmiar)
			{
			case 1:
				this.cena =  waga * odleglosc * 0.03;
				break;
			case 2:
				this.cena =  waga * odleglosc * 0.035;
				break;
			case 3:
				this.cena =  waga * odleglosc * 0.04;
				break;
				default :
					this.cena = -1;
					break;
					
			}
			
		}
		return this.cena;
	}
	
void setMiastoNadania(String miasto)
{
	this.miastoNadania=miasto;
}
}

