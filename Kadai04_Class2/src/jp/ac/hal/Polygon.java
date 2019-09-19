package jp.ac.hal;

public class Polygon {

//	private int num;
//
//	private int height;
//	private int width;
//
//	public Polygon(int num) {
//		this.num = num;
//	}
//
//	public Polygon(int height, int width) {
//		this.height = height;
//		this.width = width;
//	}

	public void line(int num) {

		for(int i = 0; i < num ; i++) {
			System.out.print("*");
		}
		System.out.println("\n");

	}

	public void square(int square) {

		for(int i = 0; i < square; i++) {
			for(int j = 1; j < square; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

		System.out.println("");

	}

	public void rectangle(int width, int height) {

		for(int i = 0; i < width; i++) {
			for(int j = 1; j < height; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	}
}
