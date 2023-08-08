package creational.builder;

public class CricketBatBuilder implements ICricketBatBuilder {
	
	
	  String handleType;
	  String material;
	  String gripper;
	  String colour;
	  String stickers;
	  
	  
	  
	@Override
	public CricketBat build() {
		
		return new CricketBat(this);
	}
	
	  public CricketBatBuilder setHandleType(String handleType) {
			this.handleType = handleType;
			return this;
		}



		public CricketBatBuilder setMaterial(String material) {
			this.material = material;
			return this;
		}



		public CricketBatBuilder setGripper(String gripper) {
			this.gripper = gripper;
			return this;
		}



		public CricketBatBuilder setColour(String colour) {
			this.colour = colour;
			return this;
		}



		public CricketBatBuilder setStickers(String stickers) {
			this.stickers = stickers;
			return this;
		}


}
