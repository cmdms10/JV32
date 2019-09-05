package jp.ac.hal;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//値渡しと参照渡し
		//ポイント！
		//引数の受け渡しには、
		//変数自体のコピーが
		//行われている。
		int a = 10;
		callByValue(a);
		System.out.println(a);

		ArrayList al = new ArrayList();
		al.add(10);
		System.out.println(al.size());
		callByRef(al);
		System.out.println(al.size());
	}

	static void callByValue(int a) {
		a += 10;
	}

	static void callByRef(ArrayList a) {
		a.add(10);
	}
}
