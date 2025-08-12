package creational.builder;

public class SportsShop {
	
	public static void main(String[] args) {

		// material and handleType are mandatory for cricket bat.
		CricketBat bat1 = new CricketBatBuilder()
								.Colour("Gold")
								.Material("English Willow")
								.HandleType("normal")
								.build();
		System.out.println(bat1);
	}

}
