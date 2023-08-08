package creational.builder;

public class SportsShop {
	
	public static void main(String[] args) {
		
		CricketBat bat1 = new CricketBatBuilder()
								.setColour(null)
								.build();
		System.out.println(bat1);
	}

}
