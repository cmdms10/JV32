package jp.ac.hal;

public class Main {

	public static void main(String[] args) {
		if(args != null && args.length != 0) {
			for (String arg : args) {
				System.out.println(arg);
			}
		}
		System.out.println("end");
	}

}
