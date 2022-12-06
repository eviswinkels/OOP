
public class Person {
	public String naam;
	public int leeftijd;
	public boolean geslacht;
	public String beroep; 

	public void doeIets() {
		System.out.println("Wij zitten in methode doeIets");
		System.out.println("Naam is " + naam);
	}
	public String WatIsJouwNaam() {
		String antwoord = "mijn naam is " + naam;
		return antwoord;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	public boolean isGeslacht() {
		return geslacht;
	}
	public void setGeslacht(boolean geslacht) {
		this.geslacht = geslacht;
	}
	public String getBeroep() {
		return beroep;
	}
	public void setBeroep(String beroep) {
		this.beroep = beroep;
	}
	
}
