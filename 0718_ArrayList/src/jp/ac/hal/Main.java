package jp.ac.hal;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//配列は固定長
		int[] a = new int[3];
		int[] b = {10,20,30};
		for(int c : b) {
			System.out.println(c);
		}
		//b = {10,20,30};
		//配列の初期化式は、
		//変数宣言時のみ利用可能。

		//可変長データ操作の一つ
		//ArrayList
		ArrayList al;
		al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		for(int i=0;i<al.size();i++) {
			System.out.println((int)(al.get(i))*1.08);
		}

		//ArrayListを使うとき、
		//大概利用型は固定のため、
		//その型を宣言することができる。
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		for(Integer i : al2) {
			System.out.println(i*1.08);
		}
	}

}
