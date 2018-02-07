package Interfejs;

import javax.swing.*;																//Biblioteka do ramek
import java.awt.*;


public class Interfejs extends JFrame{												//Dziedziczy z JFrame wiec nie trzeba tworzyc instantcji ramki
																					//tylko wywoluje sie metody
	
	static int szerokoscEkranu = Toolkit.getDefaultToolkit().getScreenSize().width;
	static int wysokoscEkranu  = Toolkit.getDefaultToolkit().getScreenSize().height;
	int szerokoscRamki = szerokoscEkranu/4;
	int wysokoscRamki = wysokoscEkranu/4;
	JButton dodajPaczke;
	JButton dodajPojazd;
	JButton wyslijPojazd;
	
	
	/**
	 * 
	 * Konstruktor interfejsu zakaldajacy ze ramka wlacza sie w podanych koordynatach
	 * 
	 */
	public Interfejs(){
		super("Aplikacja poczty");													//Konstruktor z klasy JFrame. Wywietla tytul ramki
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);						//Sprawia ze mozna zamknac ramke EXIT_ON_CLOSE = 3
		this.setVisible(true); 														//Ustawia ze ramka jest widoczna
		this.setBounds(200,200,500,250);											//Ustawia 1,2 polozenie ramki 3,4 szerokosc, wysokosc
		this.setResizable(false); 													//Sprawia ze nie mozna rozciagac ramki
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("image/ikona.png")); //Ikona ramki :3
		this.pack();																//szybsze ladownie (?)
	}
	
	/**
	 * 
	 * Konstruktor interfejsu zakaldajacy ze ramka wlacza sie w centrum
	 * 
	 */
	public Interfejs(int a)
	{
		super("Aplikacja poczty");	
		this.setVisible(true); 	
														//Konstruktor z klasy JFrame. Wywietla tytul ramki
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);						//Sprawia ze mozna zamknac ramke EXIT_ON_CLOSE = 3
		this.setPreferredSize(new Dimension(szerokoscEkranu/2, wysokoscEkranu/2));
		
		this.setLocation(szerokoscEkranu/4, wysokoscEkranu/4);
		this.setResizable(false); 													//Sprawia ze nie mozna rozciagac ramki
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("image/ikona.png")); //Ikona ramki :3
		this.pack();																//szybsze ladownie (?)
		
	}
	
	public void initButtons()
	{
		
		Container kontener = this.getContentPane();
		kontener.setLayout(null);													//Wylacza layout menagera
		dodajPaczke = new JButton("Dodaj paczke do systemu");
		dodajPojazd  = new JButton("Dodaj pojazd do systemu");;
		wyslijPojazd  = new JButton("Wyslij pojazd z paczkami");
		int szerokoscRamki = getSize().width;
		int wysokoscRamki = getSize().height;
		dodajPaczke.setLocation(szerokoscRamki/16, wysokoscRamki/2);
		dodajPaczke.setSize(szerokoscRamki/5, wysokoscRamki/10);
		kontener.add(dodajPaczke);
		
	}
	
	

}
