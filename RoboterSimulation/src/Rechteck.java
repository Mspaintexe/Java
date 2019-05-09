import java.awt.Color;

public class Rechteck {

	//Attribute
	private Punkt position = new Punkt(0,0);
	private int breite;
	private int laenge;
	private String bezeichnung;
	private Color farbe = new Color(0,0,0);
	 
	
	
	//Konstruktor 
	public Rechteck() {
		
		
	}
	
	public Rechteck(Punkt position, int breite, int laenge,String bezeichnung,Color farbe) {
		
		
	}
	
	//-------------------------------------------------------
	
	//get() Methoden :
	
	public Punkt get_position() {
	
		return position;
	}
	public int get_breite() {
		
		return breite;
	}
	public int get_laenge() {
		
		return laenge;
	}
	public String get_bezeichnung() {
	
	return bezeichnung;
	}

	public String get_farbe() {
		
		return farbe.toString();
	}
	
	//-------------------------------------------------------
	
	//set() Methoden :
	
	public void set_position(Punkt position) {
		
		this.position = position;
	}
	public void set_breite(int breite) {
		
		this.breite = breite;
	}
	public void set_laenge(int laenge) {
		
		this.laenge = laenge;
	}
	public void set_bezeichnung(String bezeichnung) {
	
		this.bezeichnung = bezeichnung;
	}

	public void set_farbe(Color farbe) {
		
		if (farbe == Color.WHITE) {
			System.out.println("FEHLER! DIE FARBE DARF NICHT WEIß SEIN"); //Eingabe: z.b "java.awt.Color.WHITE"
		}
		else {
			this.farbe = farbe;
		}
	}
	
	//-------------------------------------------------------
	
	public void bewegeUm (int dx, int dy) {
		
		position.bewegeUm(dx, dy);
	}
	
	public void bewegeUm (Punkt verschiebevektor) {
		
		position.setX(position.getX() + verschiebevektor.getX()); 
		position.setY(position.getY() + verschiebevektor.getY());

	}

	public void ausgabeAttribute() {
		System.out.println("Hier sind die Attribute des Rechteckes: ");
		System.out.println("Position: " + position.getX() + position.getY());
		System.out.println("Breite: " + breite);
		System.out.println("Länge: " + breite);
		System.out.println("Bezeichnung: " + bezeichnung);
		System.out.println("Farbe: " + farbe);
	}
}
	




