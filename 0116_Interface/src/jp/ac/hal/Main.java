package jp.ac.hal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		インタフェースはインスタンス化できない
//		Phone p = new Phone();

		Android a = new Android();
		a.call("");
		a.original();

//		インタフェースは
//		そのインタフェースを実装しているクラスを保持できる
		Phone p = new Android();
		p.call("");
//		ただし、利用できるのは
//		インタフェースで定義している機能限定。
//		p.original();
		((Android)p).original();

		p = new iPhone();
		Camera c = new iPhone();


	}

}
