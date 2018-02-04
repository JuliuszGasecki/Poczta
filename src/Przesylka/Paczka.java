/*
 * Author: Juliusz G¹secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Przesylka;

public class Paczka extends Przesylka {
	
	public Paczka(int ID, double waga, int rozmiar, String adresat, String nadawca, String miasto)
	{
		super(ID,waga, rozmiar, adresat, nadawca, miasto);
		setTyp(false);
	}
	
	}


