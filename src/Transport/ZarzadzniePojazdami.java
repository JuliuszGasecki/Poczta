package Transport;

import java.util.List;
//import java.util.Scanner;
import java.util.ArrayList;

public class ZarzadzniePojazdami {
	
	List<Przewoz> pojazdy;
	static int nextID= 0;
	
	public ZarzadzniePojazdami()
	{
		this.pojazdy = new ArrayList<>();
	}
	
	public void dodajSkuter(String doMiasta)
	{
		pojazdy.add(new Skuter(++nextID, 4, doMiasta));
	}
	public void dodajCiezarowke(String doMiasta)
	{
		pojazdy.add(new Ciezarowka(++nextID, 6, doMiasta));
	}
	public void dodajSamolot(String doMiasta)
	{
		pojazdy.add(new Samolot(++nextID, 4, doMiasta));
	}

	public Przewoz getPojazd(int i) {
		return pojazdy.get(i);
	}

	public List<Przewoz> getPojazdy() {
		return pojazdy;
	}

	public void setPojazdy(List<Przewoz> pojazdy) {
		this.pojazdy = pojazdy;
	}
	
	public int iloscPojazdow()
	{
		return pojazdy.size();
	}

}
