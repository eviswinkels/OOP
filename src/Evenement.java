
public class Evenement {

		public String naam;
		public boolean uitverkocht;
		public int prijskaartje;
		public String locatie;
		public int bezoekers;
		public char vak; 
	
	public void print() {
		System.out.println("De naam van het evenement is "+ naam);
		System.out.println("Is dit evenement uitverkocht? " + uitverkocht );
		System.out.println("De prijs van dit evenement is " + prijskaartje +" euro");
		System.out.println("De locatie van dit evenement is" + locatie);
		System.out.println("Het aantal bezoekers van het evenement is " + bezoekers);
	}
	public String printnaam() {
		String naam_evenement = "De naam van dit evenement is " + naam;
		return naam_evenement;
	}
	public String printuitverkocht() {
		String uitverkocht_evenement = "Is dit evenement uitverkocht? " + uitverkocht;
		return uitverkocht_evenement;
	}
	public String printprijs () {
		String prijs_evenement = "De prijs van dit evenement is " + prijskaartje + " euro";
		return prijs_evenement;
	
	}
	public String printlocatie () {
		String locatie_evenement = "De locatie van dit evenement is " + locatie;
		return locatie_evenement;
	}
	
	public String printbezoekers () {
		String bezoekers_evenement = "Het aantal bezoekers van dit evenement is " + bezoekers;
		return bezoekers_evenement;
		
	}
	public void geefNaam (String nieuwenaam) {
		naam = nieuwenaam;
	}
	public void geefStatus(boolean nieuwestatus) {
		uitverkocht = nieuwestatus;
		
	}
	public void geefPrijs(int nieuweprijs) {
		prijskaartje = nieuweprijs;
	}

	public void naamChange(String toName) {
		naam = toName;
	}	
	public void statusChange(boolean toStatus) {
		uitverkocht = toStatus; 
	}
	
	public void prijsChange(int toPrijs) {
		
	}
	

}

