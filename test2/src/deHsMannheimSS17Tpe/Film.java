package deHsMannheimSS17Tpe;

import java.util.ArrayList;

public class Film {
	String title = "";
	int laufzeit;
	Altersbeschränkung alter;
	Saal saal;
	ArrayList<Zeit> zeit = new ArrayList<>();

	public Film(String title, int laufzeit, Altersbeschränkung alter, Saal saal ) {
		this.title = title;
		this.laufzeit = laufzeit;
		this.alter = alter;
		this.saal = saal;
	}
	
	public void getAlleFilmeMitZeiten(){
		
	}
	
	public void getFilmeFuerSaalMitZeiten(){
		
	}
	
	public void getAlleFilme(){
		
	}

}