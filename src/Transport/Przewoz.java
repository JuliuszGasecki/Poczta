package Transport;
import Przesylka.*;

public interface Przewoz {
	
	boolean pobierzPrzesylke(Przesylka przesylka);
	void zawiez();
	double naliczCenePrzewozu(double odleglosc);
	boolean sprawdzCel(Przesylka przesylka);
	

	

}
