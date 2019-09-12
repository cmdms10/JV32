package jp.ac.hal;

public class Robot {
	private String name;
	private int id = 0;
//	フィールド宣言時に初期化
//	→ 有り

//	コンストラクタ
	public Robot() {
		this("nanashi");
//		↑ベストアンサー
//		this()は自コンストラクタ呼び出し

		this.name = "nanashi";

	}
	public Robot( String name ) {
		System.out.println("constracter");
//		コンストラクタの主な用途は初期化処理
		this.name = name;
	}
}
