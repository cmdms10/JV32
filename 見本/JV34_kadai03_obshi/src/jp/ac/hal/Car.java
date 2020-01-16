package jp.ac.hal;

public abstract class Car {
	private int position;
	private String carIcon;
	private String driveIcon;

	public Car(){
		this.carIcon = this.getCarIcon();
		this.driveIcon = this.getDriveIcon();
		this.clear();
	}

	public void clear(){
		this.position = 0;
	}

	public String drive(){
		String result = "";

		this.position = this.getNewPosition( this.position );

		for(int i = 0; i < this.position; i++){
			result += this.driveIcon;
		}
		result += this.carIcon;

		return result;
	}

	abstract protected String getCarIcon();
	abstract protected String getDriveIcon();
	abstract protected int getNewPosition( int position );
}
