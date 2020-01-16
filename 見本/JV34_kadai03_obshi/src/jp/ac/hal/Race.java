package jp.ac.hal;

public class Race {
	private Car[] cars;

	public Race( int driveCarsCount ){
		this.cars = new Car[ driveCarsCount ];
		this.reset();

	}

	public void reset(){
		for( int i = 0; i < this.cars.length; i++ ){
			int ran = (int)(Math.random() * 10) % 3;
			switch( ran ){
				case 0:
					this.cars[i] = new ElectricCar();
					break;
				case 1:
					this.cars[i] = new Bus();
					break;
				case 2:
					this.cars[i] = new SuperCar();
					break;
			}
		}
	}

	public String go(){
		StringBuilder sb = new StringBuilder();
		for( Car car : this.cars ){
			sb.append( car.drive() );
			sb.append( "<br>" );
		}
		return sb.toString();
	}
}
