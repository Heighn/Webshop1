package model;

abstract public class Product {
	static final int gram = 1;
	static final int kilo = 2;
	static final int liter = 3;
	static final int stuk = 4;
	static final int pak = 5;
	
	public Product(String naam, int prijsPerEenheid, String imageUrl, int eenheid){
	}
	public Product(String naam, int prijsPerEenheid, String imageUrl){
		this(naam, prijsPerEenheid, imageUrl, 1);
	}
	public static String getEenheidNaam(int eenheid){
		String eenheidString = "";
		if(eenheid == Product.gram) eenheidString = "gram";
		if(eenheid == Product.kilo) eenheidString = "kilo";
		if(eenheid == Product.liter) eenheidString = "liter";
		if(eenheid == Product.stuk) eenheidString = "stuk";
		if(eenheid == Product.pak) eenheidString = "pak";
		return eenheidString;
	}
	abstract public String toString();
	abstract public int getPrijs(int hoeveelheid);
}
