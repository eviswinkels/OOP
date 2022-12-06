import java.util.Scanner;

public class Applicatie {

	public static void main(String[] args) {
		System.out.println("Applicatie is gestart");
		
		Person p1 = new Person();
		p1.naam = "Henk";
		p1.leeftijd = 23;
		p1.geslacht = true;
		p1.beroep = "loodgieter";
		
		Person p2 = new Person();
		p2.naam = "Marie";
		p2.leeftijd = 25;
		p2.geslacht = false;
		p2.beroep = "kapper";
		
		p1.doeIets();	
		String antwoord = p2.WatIsJouwNaam();
		System.out.println("Antwoord van persoon 2 = " + antwoord);
		Evenement festival = new Evenement();
		festival.naam = "festival";
		festival.uitverkocht = true;
		festival.prijskaartje = 35;
		festival.locatie = "Eindhoven";
		festival.bezoekers = 2500;
		
		festival.print();
		// hallo
		p2.WatIsJouwNaam();
		
		String tekst = festival.printnaam();
		System.out.println(tekst);
		
		String tekst2 = festival.printuitverkocht();
		System.out.println(tekst2);
		
		String tekst3 = festival.printprijs();
		System.out.println(tekst3);
		
		String tekst4 = festival.printlocatie();
		System.out.println(tekst4);
		
		String tekst5 = festival.printbezoekers();
		System.out.println(tekst5);
		
		Rekenmachine r = new Rekenmachine();
		int oplossing = r.optellen(2, 3);
		System.out.println("Antwoord is "+ oplossing);
		
		festival.geefNaam("Down the rabbit hole");
		System.out.println(festival.printnaam());
		
		festival.geefStatus(false);
		System.out.println("Uitverkocht? " + festival.printuitverkocht());
		
		festival.geefPrijs(45);
		System.out.println("Prijs is: "+ festival.printprijs());
		
		festival.naamChange("Awakenings");
		System.out.println(festival.printnaam());
		
		Land Nederland = new Land();
		
		Nederland.setNaam("Nederland");
		System.out.println(Nederland.getNaam());
		
		Land a = new Land();
		int aantalInwoners = a.getaantalInwoners();
		System.out.println("Aantal inwoners is " + aantalInwoners);
		
		Boek boek = new Boek();
		System.out.println(boek.getTitel());
		
		System.out.println("Evi");
		Scanner scanner = new Scanner (System.in);
		String antwoord1 =scanner.next();
		
		Person p3 = new Person();
		System.out.println("Evi");
		Scanner scanner2 = new Scanner(System.in);
		p3.setNaam(scanner2.next());
		System.out.println("De naam is: "+ p3.getNaam());
		System.out.println("Vul hier je leeftijd in: "+ p3.getLeeftijd());
		p3.setLeeftijd(scanner2.nextInt());
		System.out.println(p3.getNaam() + "is" +p3.getLeeftijd());
		System.out.println(p3.WatIsJouwNaam());
		}



}
