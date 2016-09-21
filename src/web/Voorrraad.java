package web;
import model.Product;
import java.util.*;

public class Voorrraad {
	private static ArrayList<Product> voorraadLijst = new ArrayList<Product>();
	static void voegToe(Product product){
		voorraadLijst.add(product);
	}
}
