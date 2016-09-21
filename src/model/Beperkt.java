package model;

import java.io.PrintWriter;

public class Beperkt extends Product{
	private String naam;
	private int prijsPerEenheid;
	private String imageUrl = "";
	private int eenheid;
	private int maxHoeveelheid;
	
	public Beperkt(String naam, int prijsPerEenheid, String imageUrl, int eenheid, int maxHoeveelheid){
		super(naam, prijsPerEenheid, imageUrl, eenheid);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imageUrl = imageUrl;
		this.eenheid = eenheid;
		this.maxHoeveelheid = maxHoeveelheid;
	}
	public Beperkt(String naam, int prijsPerEenheid, String imageUrl){
		this(naam, prijsPerEenheid, imageUrl, 4, 5);
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
		return "Productnaam: " + naam + " in " + Product.getEenheidNaam(eenheid) + "Max: " + maxHoeveelheid;
	}
	public int getPrijs(int hoeveelheid){
		if(hoeveelheid < maxHoeveelheid){
			return hoeveelheid * prijsPerEenheid;
		}
		return -1;
	}
}
