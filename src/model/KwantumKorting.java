package model;

import java.io.PrintWriter;

public class KwantumKorting extends Product{
	private String naam;
	private int prijsPerEenheid; //Initieel. De prijs per eenheid daalt naarmate men meer koopt.
	private String imageUrl = "";
	private int eenheid;
	
	public KwantumKorting(String naam, int prijsPerEenheid, String imageUrl, int eenheid){
		super(naam, prijsPerEenheid, imageUrl, eenheid);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imageUrl = imageUrl;
		this.eenheid = eenheid;
	}
	public KwantumKorting(String naam, int prijsPerEenheid, String imageUrl){
		this(naam, prijsPerEenheid, imageUrl, 4);
	}
	public String getNaam(){
		return naam;
	}
	public int getEenheid(){
		return 4;
	}
	public int getPrijsPerEenheid(){
		return prijsPerEenheid;
	}
	public String getImageUrl(){
		return imageUrl;
	}
	public String toString(){
		return "Productnaam: " + naam + " in " + Product.getEenheidNaam(eenheid);
	}
	public int getPrijs(int hoeveelheid){
		//Prijs per eenheid daalt naarmate men meer koopt.
		int totaalPrijs = 0;
		int huidigePrijsPerEenheid = prijsPerEenheid;
		for(int i = 0; i < hoeveelheid; i++){
			totaalPrijs += huidigePrijsPerEenheid;
			if((i + 1) % 5 == 0 && huidigePrijsPerEenheid > 0){
				huidigePrijsPerEenheid--;
			}
		}
		return totaalPrijs;
	}
}
