
public class Boek {

		private String titel;
		private int paginas;
		private String genre;
		public String getTitel() {
			return titel;
		}
		public void setTitel(String titel) {
			this.titel = titel;
		}
		public int getPaginas() {
			return paginas;
		}
		public void setPaginas(int paginas) {
			this.paginas = paginas;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		public Boek () {
			titel = "Harry Potter";
			paginas = 513;
			genre = "Wizzard";
		}
		
		public Boek (String newTitel, int evenTellen, String newGenre) {
			titel = newTitel;
			paginas = evenTellen;
			genre = newGenre;
			
		}
		
		
}
