/**
* Die Klasse Salat repräsentiert einen Salat als Zutat.
* Sie erbt von der Klasse Zutat.
*/
public class Salat extends Zutat {

	/**
	* Konstruktor für ein Salat-Objekt.
	@param nummer die Nummer des Salats
	@param name der Name des Salats
	@param klassisch ob der Salat klassisch ist
	@param vegan ob der Salat vegan ist
	@param vegetarisch ob der Salat vegetarisch ist
	@param preis der Preis des Salats
	*/
	public Salat(int nummer, String name,  boolean klassisch, boolean vegan, boolean vegetarisch, float preis) {
		 super(nummer, name, klassisch, vegan, vegetarisch, preis);
	}
	
	/**

	Gibt die Zubereitungsanweisung für den Salat zurück.
	@return die Zubereitungsanweisung
	*/
	public String getZubereitung() {
    	return " > " + name + " wird gewaschen";
    }
	
	public String toString() {
		return super.toString();
	}

	@Override
	public int zubereiten() {
		// TODO Auto-generated method stub
		return 0;
	}
}
