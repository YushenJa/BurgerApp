/**
* Eine Klasse, die eine Zutat repräsentiert.
* Eine Zutat hat eine eindeutige Nummer, einen Namen, einen Preis, eine Höhe und eine Zubereitungszeit.
* Sie kann auch als klassisch, vegan oder vegetarisch gekennzeichnet sein.
*/
public abstract class Zutat {
	protected int nummer;
	protected String name;
	protected float preis;
	protected int hoehe;
	protected int zeit;
	protected boolean klassisch;
	protected boolean vegan;
	protected boolean vegetarisch;
	
	/**
	* Konstruktor für eine Zutat.
	@param nummer die eindeutige Nummer der Zutat
	@param name der Name der Zutat
	@param klassisch true, falls die Zutat als klassisch gekennzeichnet ist, ansonsten false
	@param vegan true, falls die Zutat als vegan gekennzeichnet ist, ansonsten false
	@param vegetarisch true, falls die Zutat als vegetarisch gekennzeichnet ist, ansonsten false
	@param preis der Preis der Zutat
	*/
	public Zutat(int nummer, String name, boolean klassisch, boolean vegan, boolean vegetarisch, float preis) {
		   // Implementierung
		this.nummer = nummer;
        this.name = name;
        this.vegan = vegan;
        this.vegetarisch = vegetarisch;
        this.klassisch = klassisch;
        this.preis = preis;
		
	}

	
	public float berechneHoehe() {
		return hoehe;
	}
	public int getNummer() {
		return this.nummer;
	}
	public String getName() {
		return name;
	}
	
	/**
	 * Gibt zurück, ob die Zutat als vegan gekennzeichnet ist oder nicht.
	@return true, falls die Zutat als vegan gekennzeichnet ist, ansonsten false
	 */
	
	public boolean isVegan() {
		if (vegan) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Gibt zurück, ob die Zutat als klassisch gekennzeichnet ist oder nicht.
	@return true, falls die Zutat als klassisch gekennzeichnet ist, ansonsten false
	 */
	public boolean isKlassisch() {
		if (klassisch) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Gibt zurück, ob die Zutat als vegetarisch gekennzeichnet ist oder nicht.
	@return true, falls die Zutat als vegetarisch gekennzeichnet ist, ansonsten false
	 */
	public boolean isVegetarisch() {
		if (vegetarisch) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public float getPreis() {
		return this.preis;
	}
	public float getHoehe() {
		return this.hoehe;
	}
	public abstract int zubereiten();
	
	/**
	 * Gibt die Zubereitungsanweisungen der Zutat zurück.
	@return die Zubereitungsanweisungen der Zutat
	 */
	public String getZubereitung() {
	    return name + " " + zubereiten();
	}
	
	/**
	 * Gibt eine String-Repräsentation der Zutat zurück.
	@return eine String-Repräsentation der Zutat
	 */
	public String toString() {
		String returner = String.format("%-20s", this.nummer) +  String.format("%-20s", this.name) +  String.format("%.2f" ,this.preis) + " €";
		if (klassisch) {
			returner += " klassisch";
		}
		if(vegan){
			returner += " vegan";
		}
		if(vegetarisch){
			returner += " vegetarisch";
		}
		return String.format("%-50s", returner);
	}
}
