package jp.ac.hal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		step1
		Ex1 hello = new Ex1();
		hello.hello();

//		step2
		Ex2 human = new Ex2();
		human.judge(19);
		human.judge(20);

//		step3 ~ 5
		Polygon hoge = new Polygon();
		hoge.line(4);
		hoge.square(3);
		hoge.rectangle(5,3);

//		step6 ~ 10
		Scanner m = new Scanner(System.in);
		HighAndLow highAndLow = new HighAndLow(m);
		System.out.print("金額を入力してください：");

		int money = m.nextInt();
//		回数
		while(money >= 10) {
			highAndLow.start();
			money -= 10;
		}
		m.close();
	}

}
