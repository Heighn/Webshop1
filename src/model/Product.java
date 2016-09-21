package model;

abstract public class Product {
	static final int gram = 1;
	static final int kilo = 2;
	static final int liter = 3;
	static final int stuk = 4;
	static final int pak = 5;

	public Product(String naam, int prijsPerEenheid, String imageUrl, int eenheid) {
	}

	public Product(String naam, int prijsPerEenheid, String imageUrl) {
		this(naam, prijsPerEenheid, imageUrl, 1);
	}

	public static String getEenheidNaam(int eenheid) {
		switch (eenheid) {
			case gram:
				return "gram";
			case kilo:
				return "kilo";
			case liter:
				return "liter";
			case stuk:
				return "stuk";
			case pak:
				return "pak";
			default:
				return "";
		}
	}

	abstract public String toString();

	abstract public int getPrijs(int hoeveelheid);
}
