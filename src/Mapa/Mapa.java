package Mapa;
import java.lang.Math.*;
import java.util.ArrayList;
import java.util.List;

public class Mapa {
	
	static List<Miasto> miasta;
	
	
	public
	Mapa()
	{
		miasta = new ArrayList<>();
		miasta.add(new Lodz());
		miasta.add(new Berlin());
		
	}
	static double wyliczOdleglosc(double X1, double Y1, double X2, double Y2)
	{
		return Math.sqrt( (Math.pow(X1, 2.0) - Math.pow(X2, 2.0)) + (Math.pow(Y1, 2.0) - Math.pow(Y2, 2.0) ) );
	}
	static double wybierzMiasto(String miastoPoczatokowe, String miastoKoncowe)
	{
		double  X1 =0 , X2 =0 , Y1 = 0, Y2 = 0;
		
		for(int i = 0; i < miasta.size(); i++)
		if(miastoPoczatokowe.equals(miasta.get(i).getNazwa())==true)
		{
			X1 = miasta.get(i).getX();
			Y1 = miasta.get(i).getX();
		}
		for(int i = 0; i < miasta.size(); i++)
			if(miastoKoncowe.equals(miasta.get(i).getNazwa())==true)
			{
				X2 = miasta.get(i).getX();
				Y2 = miasta.get(i).getX();
			}
		
			
		return wyliczOdleglosc(X1,Y1,X2,Y2);
	}

}
