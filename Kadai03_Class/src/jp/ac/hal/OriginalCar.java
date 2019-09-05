package jp.ac.hal;

public class OriginalCar {

	private String type;
	private String color;
	private int weight;

//	コンストラクタ
	public OriginalCar(String type, String color, int weight) {
		this.type = type;
		this.color = color;
		this.weight = weight;

	}

//	走行メソッド
	public void go() {
		System.out.println(this.color+"色の"+this.type+"が走る。");
	}

//	停止メソッド
	public void stop() {
		if(this.weight <= 1000) {
			System.out.println("軽々しく止まる。");
		}else {
			System.out.println("重々しく止まる。");
		}
	}

}
