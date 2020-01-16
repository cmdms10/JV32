package jp.ac.hal;

import jp.ac.hal.cast.Character;
import jp.ac.hal.cast.Hero;
import jp.ac.hal.cast.Monster;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.setName("主人公");
		h.setWeapon("エクルカリバー");

		Monster m = new Monster();
		m.setName("ゴブリン");
		m.setType("人");

		int damage = h.attack();
		m.setHp( damage );
		System.out.println("Heroの攻撃");
		System.out.println(damage+"のダメージ");
		System.out.println("残りHP:" + m.getHp());

		Character c = new Hero();
		Character d = new Monster();
		aaa(c);
		aaa(d);

//		ダメ！
//		Hero e = new Character();



	}

	private static void aaa(Character c) {
		c.sayHello();
	}

}
