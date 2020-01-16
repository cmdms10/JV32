package jp.ac.hal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		$cart[] = new Product(1,"aaa",200);
//		$cart[] = new Product(2,"bbb",300);

		List<Product> cart = new LinkedList<Product>();
		cart.add(new Product());
		cart.add(new Product());

		for( Product p : cart ) {
			System.out.println(p.getId());
		}
	}

}
