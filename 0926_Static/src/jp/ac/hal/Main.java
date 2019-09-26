package jp.ac.hal;

public class Main {

	public static void main(String[] args) {
		MyClass.id = 10;
		int a = MyClass.getId();
		System.out.println(a);
		// staticはインスタンス不要

		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();

		m1.name = "a";
		m2.name = "b";

		System.out.println(m1.name);
		System.out.println(m2.name);

		m1.inc();
		m2.inc();
		System.out.println(MyClass.id);
	}

}
