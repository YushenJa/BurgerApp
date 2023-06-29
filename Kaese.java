/**
* Die Klasse Kaese erbt von der Klasse Zutat und repräsentiert einen Käse als Zutat.
*/
public class Kaese extends Zutat{
	 private int zeit;
	/**
	* Konstruktor für die Klasse Kaese.
	@param nummer die Nummer des Käses
	@param name der Name des Käses
	@param klassisch gibt an, ob der Käse klassisch ist
	@param vegan gibt an, ob der Käse vegan ist
	@param vegetarisch gibt an, ob der Käse vegetarisch ist
	@param preis der Preis des Käses
	*/
	public Kaese(int nummer, String name,  boolean klassisch, boolean vegan, boolean vegetarisch, float preis, int zeit) {
		 super(nummer, name, klassisch, vegan, vegetarisch, preis);
		 this.zeit = zeit;
	}
	
	/**

	* Gibt die Zubereitungsschritte für den Käse zurück.
	@return die Zubereitungsschritte für den Käse (lege den Käse auf den Bratling)
	*/
	public String getZubereitung() {
    	return " > " + name + " wird auf Bratling gelegt und wird in " + zeit + " Sekunden schmelzen";
    }

	public String toString() {
		return super.toString();
	}

	@Override
	public int zubereiten() {
		return zeit;
	}
}
