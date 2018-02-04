package Budynek;
import Przesylka.*;
import java.util.List;
import java.util.ArrayList;

public class Punkt {
	
	List<Przesylka> przesylki ;
	
	Punkt()
	{
		przesylki = new ArrayList<Przesylka>();
	}
	
	void dodajList()
	{
		Listt list = new Listt(1, 1, 1, "LOL", "LOL", "LOl");
			przesylki.add(list);
		System.out.println("Dodano list :D");
	}
	
	int iloscPrzesylek()
	{
		return przesylki.size();
	}
	
	

}
