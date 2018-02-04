package Mapa;
import java.lang.Math.*;

public class Mapa {
	
	public
	double wyliczOdleglosc(double X1, double Y1, double X2, double Y2)
	{
		return Math.sqrt( (Math.pow(X1, 2.0) - Math.pow(X2, 2.0)) + (Math.pow(Y1, 2.0) - Math.pow(Y2, 2.0) ) );
	}
	

}
