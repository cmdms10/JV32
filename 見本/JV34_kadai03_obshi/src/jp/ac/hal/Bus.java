package jp.ac.hal;

public class Bus extends Car {
	private int count = 0;

	@Override
	protected String getCarIcon(){
		return "B";
	}

	@Override
	protected String getDriveIcon(){
		return "*";
	}

	@Override
	protected int getNewPosition( int nowPosition ){
		int newPosition;

		count++;
		if( 3 < count ){
			count = 0;
			newPosition = nowPosition;
		}else{
			int speed;
			if( Math.random() < 0.3 ){
				speed = 5;
			}else{
				speed = 2;
			}
			newPosition = nowPosition + speed;
		}
		return newPosition;
	}
}
