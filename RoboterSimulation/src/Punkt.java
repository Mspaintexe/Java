/**
 * Beschreiben Sie hier die Klasse Punkt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.lang.Math;

public class Punkt 
{
    private int x; //Klassenattribute 
    private int y;

    public Punkt() //Konstruktor
    {
        
        x = 0;
        y = 0;
    }
    public Punkt(int x, int y) //Konstruktor
    {
        setX(x);
        setY(y);
        
    }
    public Punkt(double x, double y) //Konstruktor
    {
        
        
    }

    public int getX() // Gibt den x Wert des Punktes wieder
    {
        
        return x;
    }
    public int getY() // Gibt den y Wert des Punktes wieder
    {
        
        return y;
    }
    public void setX(int a) // Gibt neuen x Wert
    {
        x = a;
    }
    public void setY(int b) // Gibt neuen y Wert
    {
        y = b;
    }
    public void bewegeUm(int dx, int dy) //Bewegt Punkt um dx , dy
    {
        x = x + dx;
        y = y + dy;
    }
    public void ausgabeAttribute() //Gibt die Koordinaten in der Konsole aus
    {
        System.out.println("x : " + x + " y : " + y);
        
    }
    public void ausgabeAttribute(int zahl) //Gibt die Koordinaten in der Konsole aus
    {
    	System.out.println(zahl + ".Punkt :");
        System.out.println("x = " + x + " und  y = " + y);
    }
    public double gibAbstand(int a, int b) //euklidischer Abstand zwischen dem Punkt und 2 Koordinaten
    {
        double betrag = Math.sqrt(Math.pow((x-a),(2))+Math.pow((y-b),(2)));
        
        return betrag;
    }
    
    
    public double punktAbstand(Punkt p1, Punkt p2)  // seperate Funktion die den Abstand zwischen p1 und p2 ausgibt
    {
    	
    	double betrag = Math.sqrt(Math.pow((p1.getX()-p2.getX()),(2)) + Math.pow((p1.getY()-p2.getY()),(2)));
    
    	return betrag;
    }
    
    
}
