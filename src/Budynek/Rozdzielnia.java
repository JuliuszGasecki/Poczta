/*
 * Author: Juliusz G¹secki
 * Description: 
 * Date:04.02.2018
 * 
 */
package Budynek;

//import java.util.Iterator;
import java.util.List;

import Przesylka.*;
import Transport.*;

public class Rozdzielnia {
	
	void zaladuj(List<Przesylka> przesylka, Przewoz pojazd)
	{
		if(przesylka.size()>0)
		{
			for(int i = 0; i < przesylka.size(); i++)
			{
				if(pojazd.pobierzPrzesylke(przesylka.get(i)))
				{
					System.out.println("Przesylka " + przesylka.get(i).getID() 
					+ " Jedzie do " + przesylka.get(i).getMiasto() + " pojazdem nr " + pojazd.getID());	
					przesylka.remove(przesylka.get(i));
					System.out.println("Przesylka przeniesiona w systemie");
					i--;
				}
			}
		}
		
	}
	
	

}
