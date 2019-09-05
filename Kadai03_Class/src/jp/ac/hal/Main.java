package jp.ac.hal;

public class Main {

	public static void main(String[] args) {

		//	インスタンス生成
		ProductCar car1 = new ProductCar("セダン","黒",1200);
		car1.go();
		car1.stop();
		OriginalCar car2 = new OriginalCar("軽", "白", 600);
		car2.go();
		car2.stop();
		OriginalCar car3 = new OriginalCar("スポーツカー", "赤", 1200);
		car3.go();
		car3.stop();

		OriginalCar[] cars = new OriginalCar[3];
		cars[0] = new OriginalCar("セダン", "青", 600);
		cars[1] = new OriginalCar("ワンボックス", "黄", 600);
		cars[2] = new OriginalCar("ワゴン", "灰", 600);

		for (int i = 0; i < cars.length; i++) {
			cars[i].go();
        }

	}

}
