/**
 * 
 * Broetchen Klasse
 *
 */
public class Broetchen extends Zutat {
    private int zeit;
    private int hoehe;
/**
 * 
 * @param nummer
 * @param name
 * @param klassisch "Klassisch"-Eigenschaft
 * @param vegan "Vegan"-Eigenschaft
 * @param vegetarisch "vegetarisch" -Eigenschaft
 * @param preis
 * @param hoehe
 * @param zeit
 */
    public Broetchen(int nummer, String name,  boolean klassisch, boolean vegan, boolean vegetarisch, float preis, int hoehe, int zeit) {
        super(nummer, name, klassisch, vegan, vegetarisch, preis);
        this.zeit = zeit;
        this.hoehe = hoehe;
    }

    public int zubereiten() {
    	return zeit;
	}
    public String getZubereitung() {
    	int min = zeit/60;
    	int sek = zeit - (min*60);
    	return " > " + name + " " + min + " Minuten " + sek + " Sekunden rösten";
	}
    
	public int getBackzeit() {
        return zeit;
    }

    public float getHoehe() {
    	float höhenZunahmeProMinute = 0.025f; // nimmt um 2,5% pro Minute Backzeit an Höhe auf.
        float vergrösserteHoehe = hoehe + (hoehe * höhenZunahmeProMinute * (zeit / 60)); 
        return vergrösserteHoehe; 
    }

    public String toString() {
        return super.toString();
    }
}
