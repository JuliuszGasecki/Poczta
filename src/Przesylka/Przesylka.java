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
				this.cena =  waga * odleglosc * 0.1;
				break;
			case 2:
				this.cena =  waga * odleglosc * 0.15;
				break;
			case 3:
				this.cena =  waga * odleglosc * 0.2;
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
				this.cena =  waga * odleglosc * 0.3;
				break;
			case 2:
				this.cena =  waga * odleglosc * 0.35;
				break;
			case 3:
				this.cena =  waga * odleglosc * 0.4;
				break;
				default :
					this.cena = -1;
					break;
					
			}
			
		}
		return this.cena;
	}
	
public void setMiastoNadania(String miasto)
{
	this.miastoNadania=miasto;
}

public double getWaga()
{
	return this.waga;
}


}

