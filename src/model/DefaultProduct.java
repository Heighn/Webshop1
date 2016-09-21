package model;

import java.io.PrintWriter;

public class DefaultProduct extends Product{
	private String naam;
	private int prijsPerEenheid;
	private String imageUrl = "";
	private int eenheid;
	
	public DefaultProduct(String naam, int prijsPerEenheid, String imageUrl, int eenheid){
		super(naam, prijsPerEenheid, imageUrl, eenheid);
		this.naam = naam;
		this.prijsPerEenheid = prijsPerEenheid;
		this.imageUrl = imageUrl;
		this.eenheid = eenheid;
	}
	public DefaultProduct(String naam, int prijsPerEenheid, String imageUrl){
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
		return hoeveelheid * prijsPerEenheid;
	}
}
