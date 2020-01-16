package jp.ac.hal;

public class Main {

	public static void main(String[] args) throws Exception {
		Exception e;
		e = new Exception("エラーだよ");
		e.printStackTrace();
		System.out.println(e.getMessage());

//		throw e;

		try {
			throw new Exception();
		}catch(Exception ex) {
			System.out.println("ex");
			return;
		}//catch(NullPointerException ne) {}
		finally {
			System.out.println("finally");
		}
	}

}
