package jp.ac.hal;

public class SuperCar extends Car {
	@Override
	protected String getCarIcon(){
		return "S";
	}

	@Override
	protected String getDriveIcon(){
		return "=";
	}

	@Override
	protected int getNewPosition( int nowPosition ){
		int speed = 4;
		if( Math.random() < 0.5 ){
			speed = 0;
		}else if(Math.random() < 0.2){
			speed *= 1.5;
		}
		return nowPosition + speed;
	}
}
