/**
* Die Klasse Sauce repräsentiert einen Sauce als Zutat.
* Sie erbt von der Klasse Zutat.
*/
public class Sauce extends Zutat {
	
	private int menge;
	private String geschmack;
	
	/**
	 * Konstruktor für eine Sauce.
	 * @param nummer die Nummer der Sauce
	 * @param name der Name der Sauce
	 * @param klassisch gibt an, ob die Sauce klassisch ist
	 * @param vegan gibt an, ob die Sauce vegan ist
	 * @param vegetarisch gibt an, ob die Sauce vegetarisch ist
	 * @param preis der Preis der Sauce
	 * @param menge die Menge der Sauce
	 * @param geschmack der Geschmack der Sauce
	 */
	public Sauce(int nummer, String name,  boolean klassisch, boolean vegan, boolean vegetarisch, float preis, int menge, String geschmack) {
		 super(nummer, name, klassisch, vegan, vegetarisch, preis);
		this.menge = menge;
		this.geschmack = geschmack;
	}
	
	/**
	 * Gibt die Zubereitungsanweisung für die Sauce zurück.
	 * @return die Zubereitungsanweisung
	 */
	public String getZubereitung() {
	    return " > " + name + " wird geschüttelt";
	}
	
	/**
	 * Gibt den Geschmack der Sauce zurück.
	 * @return der Geschmack der Sauce
	 */
	public String getGeschmack() {
		if(geschmack.equals("süß") && geschmack.equals("scharf")) {
			return ", scharf, süß";
		} else if (geschmack.equals("scharf")) {
			return ", scharf";
		} else if (geschmack.equals("süß")) {
			return ", süß";
		} else  {
			return "";
		}
		
	}
	
	public int getMenge(){
		return this.menge;
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
