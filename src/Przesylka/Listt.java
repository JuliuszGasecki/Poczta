/*
 * Author: Juliusz G¹secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Przesylka;

public class Listt extends Przesylka{
	
	public Listt(int ID, double waga, int rozmiar, String adresat, String nadawca, String miasto)
	{
	super(ID,waga, rozmiar, adresat, nadawca, miasto);
	setTyp(true);
	
	}
	

}
