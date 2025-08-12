package Design.Patterns.creational.builder;

public class CricketBat {
	
	
	

	private String handleType;
	 private String material;
	 private String gripper;
	 private String colour;
	 private String stickers;
	
	public CricketBat(CricketBatBuilder builder) {
		this.colour=builder.colour;
		this.handleType=builder.handleType;
		this.material="wood";
		this.gripper=builder.gripper;
		this.stickers=builder.stickers;
	}
	
	
	/*
	* Here in main product class we are avoiding setters as they make object mutable
	*
	* Mutable object means , instance variables of object getting changed
	* if we use setters then we can change the values of instance variables*/


		@Override
		public String toString() {
			return "CricketBat [handleType=" + handleType + ", material=" + material + ", gripper=" + gripper
					+ ", colour=" + colour + ", stickers=" + stickers + "]";
		}
	

}
