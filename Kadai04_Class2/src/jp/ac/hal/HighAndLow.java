package jp.ac.hal;

import java.util.Random;
import java.util.Scanner;

public class HighAndLow {

	//	挑戦回数
	private int times = 0;
	//	ハイスコア値
	private int high = Integer.MAX_VALUE;

	private Scanner set ;

//	コンストラクタ
	public HighAndLow(Scanner s) {
		this.set = s;
	}

	public void start() {
//		ぶん回した回数
		int count = 1;

		System.out.println(times+"回目の挑戦！");
		//　乱数生成
		Random r = new Random();
		int ans = r.nextInt(21);

		//　ユーザ入力
		System.out.print("数値を入力してください：");
		int num = this.set.nextInt();
		while(ans != num ) {
			if(ans > num) {
				//　大きい
				System.out.println("もっと大きい数値です。");
			}else{
				//　小さい
				System.out.println("もっと小さい数値です。");
			}
			System.out.print("数値を入力してください：");
			num = this.set.nextInt();
			count++;
		}
		//　正解
		System.out.print("正解!");
		System.out.print(count+"回で終了。");

		if(count < this.high) {
			this.high = count;
			System.out.print("highスコア");
		}
		System.out.println();
		count = 1;
		times++;
	}
}
