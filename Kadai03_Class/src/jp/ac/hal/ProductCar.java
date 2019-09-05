package jp.ac.hal;

public class ProductCar {

	public String type;
	public String color;
	public int weight;

	//	コンストラクタ
	ProductCar(String type, String color, int weight) {
		this.type = type;
		this.color = color;
		this.weight = weight;
	}

	public void go() {
		System.out.println(this.color+"色の"+this.type+"が走る。");
	}

	public void stop() {
		System.out.println("止まる。");
	}
}
