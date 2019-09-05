package jp.ac.hal;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Robot r;

		//インスタンス(実体)化
		r = new Robot();


		//メソッド呼び出し
		r.getName();
		//※戻り値は、受け取らなくてもOK

		String rName = r.getName();
		//↓実行時のイメージ
		//String rName = "ドラえもん";
		System.out.println(rName);

		r.printName();

		Random random = new Random();
		int rand = random.nextInt(4);
		r.giveDora(rand);
		//とくにこれ↑を実引数と言う

		myMethod();

		System.out.println("end");
	}

	static void myMethod() {

	}

}
