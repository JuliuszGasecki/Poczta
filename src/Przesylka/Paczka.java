/*
 * Author: Juliusz G�secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Przesylka;

abstract public class Paczka extends Przesylka {
	
	boolean typ;
	
	public Paczka(int ID, double waga, int rozmiar, String adresat, String nadawca, String miasto)
	{
		super(ID,waga, rozmiar, adresat, nadawca, miasto);
		setTyp(false);
	}
	
	}


