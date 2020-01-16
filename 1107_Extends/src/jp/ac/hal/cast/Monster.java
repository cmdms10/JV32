package jp.ac.hal.cast;

public class Monster extends Character {
	public Monster() {
		super("",1);
	}

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void sayHello() {
		System.out.println("がうー");
	}

}