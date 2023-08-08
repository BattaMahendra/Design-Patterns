package creational.builder;

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
	
	
	 public void setHandleType(String handleType) {
			this.handleType = handleType;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public void setGripper(String gripper) {
			this.gripper = gripper;
		}


		public void setColour(String colour) {
			this.colour = colour;
		}

		public void setStickers(String stickers) {
			this.stickers = stickers;
		}


		@Override
		public String toString() {
			return "CricketBat [handleType=" + handleType + ", material=" + material + ", gripper=" + gripper
					+ ", colour=" + colour + ", stickers=" + stickers + "]";
		}
	

}
