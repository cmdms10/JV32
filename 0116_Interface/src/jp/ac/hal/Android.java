package jp.ac.hal;

public class Android implements Phone {

	@Override
	public void call(String toNumber) {
		System.out.println("android call");
	}

	public void original() {

	}
}
