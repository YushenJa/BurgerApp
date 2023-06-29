import java.util.Scanner;
public class BestellungsApp {
	/**
	 * Ablauf 
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		ZutatenVerwaltung zv = new ZutatenVerwaltung();
		Burger[] meineBurger = new Burger[10];
	    int bestellungIndex = 0;
	    float gesamtPreis = 0;
	    int gesamtZeit = 0;
	    boolean BestellungsEnde = false;
	    boolean alleBurgerAbgeschlossen = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("You’ll never burger alone - Create your Burger\r\n"
				+ "Mit 'menu' kannst du dir alle zur Verfügung stehenden Zutaten anzeigen lassen.\r\n"
				+ "Mit 'neuer Burger <Name deinen Burger>' kannst du neuer Burger zusamenstellen.\r\n"
				+ "Mit 'zutat' und der jeweiligen Nummer kannst du eine Zutat in dem von dir erstellten Burger auswählen.\r\n"
				+ "Mit „ok“ kannst du deine Zusammenstellung abschließen.\r\n"
				+ "Mit „meine burger“ kannst du von dir erstellten Burger schauen.\r\n"
				+"Mit 'bestellen' kannst du deine Bestellung bestätigen und abschließen. Wir werden mit dem Kochen beginnen.");
		while (bestellungIndex < 10 && BestellungsEnde != true) {		// Aufteilen des Befehls
			Burger Burger = new Burger();
			
			while(true) {
	            System.out.print("Bitte deine Eingabe: ");
	            String eingabe = input.nextLine().toLowerCase(); 		// Eingabeauswertung
	        
	            if (eingabe.equals("menu")) {		// Speisekarte anzeigen
	            	zv.printZutatenListe();
	            } else if (eingabe.startsWith("neuer burger")) {
	            	String burgerName = eingabe.substring(12).trim();
	                if(burgerName.equals("")) {
	                	System.out.println("Ungültige Name!");
	                } else {
	                	alleBurgerAbgeschlossen = false;
	                	Burger.setName(burgerName);
	                	System.out.println("Burger " + burgerName + " war efolgreich erstellt. Fügen Sie die Zutaten ein.");
	                }
	            } else if (eingabe.startsWith("zutat ")) {		// Zutat auswählen
	            	if ((Burger.getName() == null))  {
                    	System.out.println("Du musst zunächst einen neuen Burger erstellen");
                    } else {
		                int zutatenNummer = Integer.parseInt(eingabe.substring(6));
		                Zutat z = zv.findeZutat(zutatenNummer);
		                if (z == null) {
		                    System.out.println("Ungültige Zutatennummer!");
		                } else {
						Burger.fuegeZutatHinzu(z);
		                }
                    }
	            }  else if (eingabe.equals("ok")) {		// Burger abschließen
	                if (Burger.getAnzahlZutaten() == 0) {
	                    System.out.println("Burger hat noch keine Zutaten");
	                } else {
	                    boolean hatBroetchen = false;
	                    for (int i = 0; i < Burger.getAnzahlZutaten(); i++) {
	                        if (((Zutat) Burger.getZutaten()[i]).getNummer() / 10 == 1) {
	                            hatBroetchen = true;
	                            break;
	                        }
	                    }
	                    if (!hatBroetchen) {
	                        System.out.println("Es muss mindestens ein Brötchen im Burger sein!");
	                    } else {
	                    	meineBurger[bestellungIndex] = Burger;
	                        bestellungIndex++;
	                        alleBurgerAbgeschlossen = true;
	                        System.out.println("Burger erfolgreich bestellt!");
	                        break;
	                    }
	                    
	                }
	            } else if (eingabe.equals("meine burger")) {			// Gewählte Objekte anzeigen
	            	for (int x= 0; x< bestellungIndex; x++) {
		            	System.out.println(meineBurger[x].getName() + ": "+ meineBurger[x].getZutatNamen());
	            	}
	            } 
	            else if (eingabe.equals("bestellen")) {			// Bestellung abschließen
	                if (alleBurgerAbgeschlossen != true) {
	                    System.out.println("Es gibt mindestens einen nicht abgeschlossenen Burger");
	                } else {
	                    BestellungsEnde = true;
	                    for (int i = 0; i < bestellungIndex; i++) {
	                        System.out.println(meineBurger[i].getRezept());
	                    }
	                    break;
	                }
	            } else {
	                System.out.println("Falsche Eingabe");
	            }
			}
        }
		
		// if 10 bestellt werden, dann kommen automatisch die Rezepte
		if (bestellungIndex == 10) {
            BestellungsEnde = true;
            System.out.println("Du hast die maximale Anzahl von Burgern bestellt (10)");
            for (int i = 0; i < bestellungIndex; i++) {
                System.out.println(meineBurger[i].getRezept());
            }
        }
		
		//Gesamt Preis und gesamt Zeit ausgabe
		for (int i = 0; i < bestellungIndex; i++) {
            gesamtPreis += meineBurger[i].preisBerechnung();
            gesamtZeit += meineBurger[i].zeit();
        }
		System.out.printf("\nGesamtpreis: %.2f €", gesamtPreis );
        System.out.println("\nGesamtzeit: " + gesamtZeit/60 + " Minuten " + (gesamtZeit-((gesamtZeit/60)*60)) + " Sekunden");
        System.out.println("\nVielen Dank für deine Bestellung! Dein Burger ist auf dem Weg zu dir.");
	}

}
