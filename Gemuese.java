/**
 * Die Klasse Gemuese ist eine Unterklasse der Klasse Zutat. 
 * Sie erbt alle Eigenschaften und Methoden der Zutat-Klasse und fügt zusätzliche Eigenschaften für die Scheibendicke und die Anzahl der Scheiben hinzu.
 */
public class Gemuese extends Zutat {
	
	//Die Scheibendicke des Gemüses in Millimetern. 
	private int scheibenDicke;
	
	//Die Anzahl der Scheiben, in die das Gemüse geschnitten werden soll.
	private int scheibenAnzahl;
	
	/**
	 * Der Konstruktor für die Gemuese-Klasse.
	 * 
	 * @param nummer die Nummer der Zutat
	 * @param name der Name der Zutat
	 * @param klassisch true, wenn die Zutat zur klassischen Küche gehört, false sonst
	 * @param vegan true, wenn die Zutat vegan ist, false sonst
	 * @param vegetarisch true, wenn die Zutat vegetarisch ist, false sonst
	 * @param preis der Preis der Zutat
	 * @param scheibenDicke die Scheibendicke des Gemüses in Millimetern
	 * @param scheibenAnzahl die Anzahl der Scheiben, in die das Gemüse geschnitten werden soll
	 */
	public Gemuese(int nummer, String name,  boolean klassisch, boolean vegan, boolean vegetarisch, float preis, int scheibenDicke, int scheibenAnzahl) {
		 super(nummer, name, klassisch, vegan, vegetarisch, preis);
		this.scheibenDicke = scheibenDicke;
		this.scheibenAnzahl = scheibenAnzahl;
	}
	
	/**
	 * Berechnet die Zubereitungszeit des Gemüses.
	 * 
	 * @return die Zubereitungszeit in Sekunden
	 */
	public int zubereiten() {
		int zeit = scheibenAnzahl;
		return zeit;
	}
	
	public float getHoehe() { 
        return (scheibenDicke*scheibenAnzahl); //Hoehe von Gemuese, je nach menge
    }
	
	/**
	 * Gibt eine Anweisung zurück, wie das Gemüse zubereitet werden soll.
	 * 
	 * @return eine Zeichenkette mit der Zubereitungsanweisung
	 */
	public String getZubereitung() {
    	return " > " + name + " wird gewaschen, " + scheibenAnzahl + " Scheibe bzw. Ring wederen "+ scheibenAnzahl+ " sekunden lang geschnitten";
    }

	public String toString() {
		return super.toString();
	}

}
