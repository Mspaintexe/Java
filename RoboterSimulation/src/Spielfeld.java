import java.util.Scanner;
import java.util.Arrays;

public class Spielfeld {

	
	
	
	private int pLaenge = 1000;
	private int pBreite = 1000;
	Punkt nextPunkt = new Punkt();
	
	public Spielfeld() {
		
		
	}
	
	public Punkt[] punkteEingeben() {
		
		Scanner userInput = new Scanner(System.in); 						// Userinput Scanner
		System.out.println("Wie viele Punkte? : ");
		int anzahlPunkte = userInput.nextInt() + 1; 						//Anzahl der Punkte -> UserInput.nextInt = int 
		
		Punkt[] punktArray = new Punkt[anzahlPunkte]; 						// Erzeugen eines Arrays das jeden Punkt speichert
		
		punktArray[0] = new Punkt(0,0); 									// Startpunkt des Roboters = (0,0)
		
		for(int counter = 1; counter < anzahlPunkte; counter++) 			//Füllen des Arrays mit Punkten
		{
		
			System.out.println("Koordinaten für den " + counter + ". Punkt");
			
			
			
			System.out.println("x :");
			int xInput = userInput.nextInt();
				
			if ( (xInput >= 0) && (xInput <= pBreite) ){  
					
				nextPunkt.setX(xInput);
				
				
			}
			
			else {
					
				System.out.println("FEHLER! BITTE X-WERTE VON 0 BIS " + pBreite +  " EINGEBEN");
					break;
			}

				
			System.out.println("y :");
			int yInput = userInput.nextInt();
				
			if ( (yInput >= 0) && (yInput <= pLaenge) ){  
					
				nextPunkt.setY(yInput);
				
				
			}
			
			else {
					
				System.out.println("FEHLER! BITTE Y-WERTE VON 0 BIS " + pLaenge + " EINGEBEN");
					break;
			}
			
			
			punktArray[counter] = new Punkt(nextPunkt.getX(),nextPunkt.getY());
		
			
		}
		
		return punktArray;
		
	}
	
	public void poiSortieren(Punkt[] poi) 		//Sotiert die Punkte nach Abstand
	{										
		int zaehler = 1; 
		Punkt abstand = new Punkt();
		Punkt[] poiSortiert = new Punkt[poi.length];
		ArrayCheck arraycheck = new ArrayCheck();
		double[] abstandSortiert = new double[poi.length];
		
		poiSortiert[0] = poi[0];
		
		for (int count = 1; count < poi.length ; count++) 
		{
			
		
			for (int x = 0; x < poi.length ; x++)  //Abstand von P zu jedem Punkt
			{
				
				abstandSortiert[x] = abstand.punktAbstand(poiSortiert[count-1], poi[x]);
				
			}
			
			Arrays.sort(abstandSortiert); //Sortieren
			
			
			for (int x = 0; x < poi.length ; x++) 
			{
				
				if (abstandSortiert[zaehler] == abstand.punktAbstand(poiSortiert[count-1],poi[x]))
				{

					if (arraycheck.equal(poiSortiert, poi[x]) == false) 
					{
						poiSortiert[count] = poi[x];
						break;
						
					}
					else 
					{
						
						zaehler++;
						
						if (poiSortiert[count] == null) 			//Fehler Abfangen
						{
							x = -1;
						}
					}

				}
			
			}
			
			zaehler = 1;
		
		}
			
		
		for(int x = 0; x < poiSortiert.length ; x++) 
		{
			
			poiSortiert[x].ausgabeAttribute(x);
			
		}
		
		
	
	}
}
