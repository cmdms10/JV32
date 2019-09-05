package jp.ac.hal;

public class Main {

	public static void main(String[] args) {
		//大量文字列連結は、
		//StringBuilderを使う！
		int loop_count = 100000;
		long start_time = System.currentTimeMillis();
		String a = "";
		for(int i=0;i<loop_count;i++) {
			a += "a";
		}
		System.out.println(System.currentTimeMillis() - start_time);

		start_time = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<loop_count;i++) {
			sb.append("a");
		}
		System.out.println(System.currentTimeMillis() - start_time);
		//生成した文字列を用いるには、
		//toString();
		//sb.toString();
	}
}
