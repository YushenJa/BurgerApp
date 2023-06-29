
/**
*Die Classe ZutatenVerwaltung  mit allen Zutaten.
*/
public class ZutatenVerwaltung {

	// Feld, das eine Liste von Zutatenobjekten speichert
	private Zutat[] zutatenListe;

	/**
	 * Konstruktor der Klasse ZutatenVerwaltung.
	 * In diesem Konstruktor werden alle Zutatenobjekte erstellt und in der zutatenListe gespeichert.
	 */
	public ZutatenVerwaltung() {
		zutatenListe = new Zutat[]{
		new Broetchen(10, "Hamburger", true, false, true, 0.85f, 27, 90),
		new Broetchen(11, "Hamburger Sesam", true, false, true, 0.95f, 28, 90),
		new Broetchen(12, "Vegan-Brötchen", false, true, false, 0.55f, 34, 240),
		new Broetchen(13, "Ciabatta", false, false, true, 0.45f, 41, 330),
		new Bratling(20, "Rindfleisch", true, false, false, 1.85f, 25, 270),
		new Bratling(21, "Hähnchenfleisch", false, false, false, 1.15f, 11, 180),
		new Bratling(22, "Falaffel-Bratling", false, true, false, 1.45f, 21, 210),
		new Bratling(23, "Gemüsebratling", false, false, true, 1.75f, 25, 240),
		new Bratling(24, "Bacon", false, false, false, 0.90f, 0, 2),
		new Salat(30, "Eisberg", true, true, false, 0.18f),
		new Salat(31, "Rucola", false, true, false, 0.25f),
		new Gemuese(40, "Tomate", true, true, false, 0.25f, 3, 3),
		new Gemuese(41,"Salzgurke", true, true, false, 0.15f, 2, 4),
		new Gemuese(42, "Rote Zwiebelringe", false, true, false, 0.08f, 2, 5),
		new Gemuese(43, "Jalapeño-Ringe", false, true, false, 0.08f, 2, 5),
		new Kaese(50, "Sandwich-Käse", true, false, true, 0.39f, 80),
		new Kaese(51, "Gouda", false, false, true, 0.59f, 140),
		new Kaese(52, "Salakis", false, false, true, 0.75f, 60),
		new Kaese(53, "Landana Rosso", false, false, true, 0.95f, 210),
		new Sauce(60, "Ketchup", true, true, false, 0.10f, 5, "normal"),
		new Sauce(61, "Sandwich-Sauce", false, false, true, 0.15f, 10, "normal"),
		new Sauce(62, "Chili-Sauce", false, true, false, 0.25f, 8, "scharf"),
		new Sauce(63, "Honig-Senf-Sauce", false, false, true, 0.18f, 8, "süß"),
		// Setzen der restlichen Einträge auf null
		};
	}

	/**
	* Die Methode {@code findeZutat} sucht in der Liste der Zutaten nach einer Zutat mit einer bestimmten Nummer und gibt sie zurück.
	* @param Nummer die Nummer der Zutat, die gesucht werden soll
	* @return die Zutat mit der gesuchten Nummer oder {@code null}, falls keine Zutat mit der gesuchten Nummer gefunden wurde
	*/
	public Zutat findeZutat(int Nummer) {
		for (Zutat z : zutatenListe) {
			if (z.getNummer() == Nummer) {
				return z;
			}
		}
		return null;
	}
	
	/**

	* Die Methode gibt die Liste der Zutaten aus, die der Burger enthält.
	* Sie gibt zuerst die Kategorie der Zutat aus und dann die einzelnen Zutaten.
	*/
	public void printZutatenListe() {
		for (Zutat z: zutatenListe) {
			if (z.getNummer() % 10 == 0 && z.getNummer() / 10 == 1) {
				System.out.println("");
	            System.out.println("Brötchen:");
	        } else if (z.getNummer() % 10 == 0 && z.getNummer() / 10 == 2){
	        	System.out.println("");
	        	System.out.println("Bratlings:");
	        } else if (z.getNummer() % 10 == 0 && z.getNummer() / 10 == 3){
	        	System.out.println("");
	        	System.out.println("Salat:");
	        } else if (z.getNummer() % 10 == 0 && z.getNummer() / 10 == 4){
	        	System.out.println("");
	        	System.out.println("Gemuese:");
	        } else if (z.getNummer() % 10 == 0 && z.getNummer() / 10 == 5){
	        	System.out.println("");
	        	System.out.println("Käse:");
	        } else if (z.getNummer() % 10 == 0 && z.getNummer() / 10 == 6){
	        	System.out.println("");
	        	System.out.println("Sauce:");
	        }
			if (z != null) {
				System.out.print(z.toString());
				System.out.println();
	            
	        }
	    }
	}
	
}