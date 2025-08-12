package Design.Patterns.structural.adapter;

public class Power {
	
	int power;
	
	public Power() {
	}

	public Power(int power) {
		super();
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Power [power=" + power + "]";
	}
	

}
