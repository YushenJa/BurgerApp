/**
 * Die Burger-Klasse stellt einen Burger mit verschiedenen Zutaten und Eigenschaften dar.
 */
public class Burger {
    
    private String name; // Name des Burgers
    private Zutat[] zutaten; // Array von Zutaten, die zum Burger hinzugefügt wurden
    private int anzahlZutaten; // Anzahl der Zutaten, die zum Burger hinzugefügt wurden
    private int anzahlBroetchen = 0; // Anzahl der Brötchen, die zum Burger hinzugefügt wurden
    float hoehe; // Höhe des Burgers in mm
    float zubereitungszeit; // Zubereitungszeit des Burgers in Sekunden
    float preis; // Preis des Burgers in Euro
   
    /**
     * Konstruktor für die Burger-Klasse.
     * Erzeugt einen neuen Burger mit einem Namen und einem Array von Zutaten.
     *
     * @param name Der Name des Burgers.
     * @param zutaten Das Array von Zutaten, die zum Burger hinzugefügt werden sollen.
     * @param anzahlZutaten Die Anzahl der Zutaten, die zum Burger hinzugefügt werden sollen.
     *                      Diese darf maximal 9 sein.
     */
    public Burger() {
        this.name = name;
        this.zutaten = new Zutat[9];
        this.anzahlZutaten = 0;
        this.hoehe = 0;
        this.zubereitungszeit = 0;
        this.preis = 0;
    }

    /**
     * Gibt den Namen des Burgers zurück.
     *
     * @return Der Name des Burgers.
     */
    public String getName() {
        return name ;
    }

    /**
     * Setzt den Namen des Burgers.
     *
     * @param name Der neue Name des Burgers.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Fügt eine Zutat zum Burger hinzu.
     *
     * @param z Die Zutat, die zum Burger hinzugefügt werden soll.
     */
	public void fuegeZutatHinzu(Zutat z) {
		if (anzahlZutaten < 9) {
			if (z.getNummer() /10 == 1 && anzahlBroetchen >= 1) {
                System.out.println("Es darf nur ein Brötchen hinzugefügt werden!");
            } else if (z.getNummer() /10 == 1) {
	            anzahlBroetchen++;
	            for (int i = 0; i < anzahlBroetchen; i++) {
	                if (z.getNummer() /10 == 1) {
	                    zutaten[anzahlZutaten] = z;
		                anzahlZutaten++;
		                System.out.println(z.getName() + " hinzugefügt!");
	                }
	            }
	           
	        } else {
                zutaten[anzahlZutaten] = z;
                anzahlZutaten++;
                System.out.println(z.getName() + " hinzugefügt!");
            }
	    } else {
	        System.out.println("Burger ist schon voll!");
	    }
	}
	
	/**
	 * Methode zur Berechnung des Preises des Burgers
	 * @return float: preis
	 */
		public float preisBerechnung() {
		    float preis = 0;
		    for (int i = 0; i < anzahlZutaten; i++) {
		        preis += zutaten[i].getPreis();  // ruft die Methode getPreis() in der Klasse Zutat auf
		    }
		    return preis;
		}
		public float zeit() {
		    float zeit = 0;
		    for (int i = 0; i < anzahlZutaten; i++) {
		        zeit += zutaten[i].zubereiten();  // ruft die Methode getPreis() in der Klasse Zutat auf
		    }
		    return zeit;
		}
		
		/**
		 * Methode zur Berechnung der Gesamthöhe des Burgers
		 * @return float: hoehe
		 */
		public float hoeheBerechnung() {
		    float hoehe = 0;
		    for (int i = 0; i < anzahlZutaten; i++) {
		        hoehe += zutaten[i].getHoehe();  // ruft die Methode getHoehe() in der Klasse Zutat auf
		    }
		    hoehe = hoehe/10; 
		    return hoehe;
		}
		
		/**
		 * 	
		 * @return Type von Burger: vegan, veretarisch, klassisch 
		 */
		public String getType() {
		    boolean allKlassisch = true;
		    boolean allVegan = true;
		    boolean allVegetarisch = true;

		    for (int i = 0; i < anzahlZutaten; i++) {
		        Zutat z = zutaten[i];
		        if (!z.isKlassisch()) {
		            allKlassisch = false;
		        }
		        if (!z.isVegan()) {
		            allVegan = false;
		        }
		        if (!z.isVegetarisch() && !z.isVegan()) {
		            allVegetarisch = false;
		        }
		    }

		    if (allVegan) {
		        return " - Vegan";
		    } else if (allVegetarisch) {
		        return " - Vegetarisch";
		    } else if (allKlassisch){
		        return " - Klassisch";
		    } else {
		    	return "";
		    }
		}
	/**
	 * Rezept des Burgers
	 * @return String
	 */
	public String getRezept() {
		StringBuilder rezept = new StringBuilder();
		String sauceGeschmack = "";
	    for (Zutat zutat : zutaten) {
	        if (zutat instanceof Sauce) {
	            sauceGeschmack = ((Sauce) zutat).getGeschmack();
	            break;
	        }
	    }
	    
		rezept.append(String.format("\nRezept - %s (%.2f cm%s%s) - %.2f €\n", name, hoeheBerechnung(), getType(), sauceGeschmack, preisBerechnung()));
	    rezept.append("Zutaten für " + name + ": ");
	    
	    for (int i = 0; i < zutaten.length; i++) {
	        if (zutaten[i] != null) {
	            rezept.append(zutaten[i].getName());
	            if (i < zutaten.length - 1 && zutaten[i+1] != null) {
	                rezept.append(", ");
	            }
	        }
	    }
	    rezept.append("\n Zubereitung:\n ");
	    
	    for (int i = 0; i < zutaten.length; i++) {
	        if (zutaten[i] != null) {
	            rezept.append(zutaten[i].getZubereitung() + "\n ");
	        }
	    }
	    
	    return rezept.toString();
	
	}
	
	public int getAnzahlZutaten(){
		return anzahlZutaten;
	}

	public boolean getBroetchen() {
		
		return true;
	}
	
	public Object[] getZutaten() {
		return zutaten;
	}
	/**
	 * 
	 * @return String: alle zutaten im Burger
	 */
	public String getZutatNamen() {
		String zutatNamen = "";
	    for (int i = 0; i < this.anzahlZutaten; i++) {
	        zutatNamen += this.zutaten[i].getName();
	        if (i != this.anzahlZutaten - 1) {
	            zutatNamen += ", ";
	        }
	    }
	    return zutatNamen;
	}

	
	
}
	
    

