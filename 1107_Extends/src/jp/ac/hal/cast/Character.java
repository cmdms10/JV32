package jp.ac.hal.cast;

public class Character {
	private String name;
	protected int hp = 100;
//	protectedは継承関係の子供までは見せる。
//	その他のクラスからは見れない
//	Java限定、同一パッケージも見れる

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if( 0 < hp ) {
			this.hp = hp;
		} else {
			this.hp = 0;
		}
		this.hp = hp;
	}

	public int attack() {
		return 10;
	}

	public void takeDamage(int damage) {
		this.setHp(this.hp - damage);
	}

	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
		System.out.println("super");
	}

	public void sayHello() {
		System.out.println("hello");
	}
}
