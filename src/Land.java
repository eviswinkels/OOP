
public class Land {
	private String naam;
	private int aantalInwoners;
	private String continent;

	public void setNaam(String nieuweNaam) {
		naam = nieuweNaam;

	}
	
	public void setaantalInwoners (int nieuwAantalInwoners) {
		aantalInwoners = nieuwAantalInwoners;
		
	}
	
	public void setContinent(String nieuwContinent) {
		continent = nieuwContinent;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public int getaantalInwoners () {
		return aantalInwoners;
		
	}
	public String getContinent() {
		return continent;
	}
	public Land() {
		System.err.println("In constructor ");
		naam = "Duitsland";
		aantalInwoners = 50000;
		continent = "Europa";
	}
	
}
