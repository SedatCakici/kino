package deHsMannheimSS17Tpe;

public class Kino {
	String name="";
	String stadt="";
	Saal saal;
//	Film film[];
	
	public Kino(String name, String stadt, Saal saal) {
		this.name = name;
		this.stadt = stadt;
		this.saal = saal;
	}
	
	

//	public void setFilm(Film film) {
//		this.film[] = film;
//	}



	@Override
	public String toString() {
		return "Kino [name=" + name + ", stadt=" + stadt + ", saal=" + saal + "]";
	}
	
}