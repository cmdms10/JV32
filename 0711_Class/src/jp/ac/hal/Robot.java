package jp.ac.hal;

public class Robot {
	//フィールド定義
	String id;
	String color = "blue";
	String type = "cat";
	String name = "ドラえもん";

	//メソッド定義
	String getName() {
		return this.name;
	}

	void printName() {
		System.out.println("ぼく" + this.name);
	}

	void giveDora(int dorayakiCount) {
		//とくにこれ↑を仮引数という。
		switch (dorayakiCount) {
		case 0:
			System.out.println("おかえりください。");
			break;
		case 1:
			System.out.println("もっとちょうだい");
			break;
		case 2:
			System.out.println("にや");
			break;
		case 3:
			System.out.println("まんぞく");
			break;
		}
	}
}
