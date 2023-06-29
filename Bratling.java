
/**
 * Bratling Klasse.
 *
 * @author Jermaine Pedraza
 */
public class Bratling extends Zutat {
    private int zeit;
    private int hoehe;;
/**
 * 
 * @param nummer
 * @param name
 * @param klassisch "Klassisch"-Eigenschaft
 * @param vegan "Vegan"-Eigenschaft
 * @param vegetarisch "vegetarisch" -Eigenschaft
 * @param preis
 * @param hoehe
 * @param zeit Zubereitungszeit
 */
    public Bratling(int nummer, String name,  boolean klassisch, boolean vegan, boolean vegetarisch, float preis, int hoehe, int zeit) {
        super(nummer, name, klassisch, vegan, vegetarisch, preis);
        this.zeit = zeit;
        this.hoehe = hoehe;
    }
/**
 * 
 */
    public int zubereiten() {
    	return zeit;
	}
	
    public String getZubereitung() {
        int min = zeit/2/60;
        int sek = (zeit/2)-(min*60);
        return " > " + name + " von jeder Seite " + min + " Minute " + sek + " Sekunden" + " grillen";
    }

    
    public float getZeit() {
        return zeit;
    }

    public float getHoehe() {
    	float höhenreduzierungProMinute = 0.035f; // verliert um 3,5% pro Minute Bratzeit an Höhe.
        float reduzierteHoehe = hoehe - (hoehe * höhenreduzierungProMinute * (zeit / 60)); 
        return reduzierteHoehe; 
    } 
    public String getName(){
		return this.name;
	}
    /**
     * @see Zutat#toString()
     */
    public String toString() {
        return super.toString();
    }
}
