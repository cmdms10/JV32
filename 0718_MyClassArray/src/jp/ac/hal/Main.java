package jp.ac.hal;

public class Main {

	public static void main(String[] args) {
		Product[] cart;
		cart = new Product[5];
		for(int i=0;i<cart.length;i++) {
			cart[i] = null;
		}

		//１つ目の商品登録
		cart[0] = new Product(1,"a");
		cart[1] = new Product(3,"b");

		for(Product p : cart) {
			if(p != null) {
				System.out.println(p.getId());
			}
		}

		//finalをつけると変更できなくなる
		final int a = 10;
		//a = 20;
	}
}
