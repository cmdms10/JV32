package jp.ac.hal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Robot r = new Robot("dora");
		r = new Robot();
//		MyClass m = new MyClass();

		System.out.println("start");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(a);
		s.close();
		System.out.println("end");
	}

}
