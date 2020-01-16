package jp.ac.hal.cast;

//extends Objectがデフォルト
public class Hero extends Character {
	private String weapon;

	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

//	メソッドの上書き（オーバーライド）
	@Override
	public int attack() {
		hp = 300;
		this.hp = 500;
		super.hp = 700;
		return 100;
	}

	public Hero() {
//		親のコンストラクタ呼び出し
		super("主人公",300);
		super.setName("主人公");
		super.setHp(300);
		System.out.println("sub");
	}

	@Override
	public void sayHello() {
		System.out.println("へろー");
	}


}
