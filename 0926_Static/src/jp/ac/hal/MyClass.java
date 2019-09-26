package jp.ac.hal;

public class MyClass {
	public static int id = 0;
	public static int getId() {
//		return this.id;
//		staticにthisは使えない
		return id;
	}

	public String name;
	public static void inc() {
		id++;
//		name = "";
//		a();
	}

	public void a() {
		this.name = "";
		id++;
	}

}
