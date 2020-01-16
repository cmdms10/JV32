package jp.ac.hal;

public class ElectricCar extends Car {
	private int count = 0;

	@Override
	protected String getCarIcon(){
		return "E";
	}

	@Override
	protected String getDriveIcon(){
		return "-";
	}

	@Override
	protected int getNewPosition( int nowPosition ){
		int newPosition;

		this.count++;
		if( 5 < count ){
			if( Math.random() < 0.5 ){
				count = 0;
			}
			newPosition = nowPosition;
		}else{
			newPosition = nowPosition + 3;
		}
		return newPosition;
	}
}
