package Design.Patterns.creational.builder;


/**
 * Builder design pattern is used to separate the instantiation of product from client code
 * Builder class takes care of the instantiation logic.
 *
 * Builder design pattern is used when an object has too many fields
 * 1. It avoids telescopic constructor problems if the product have too many fields
 * 2. For better readability and simplicity for client when product is being created
 * 3. If we are not using builder pattern and instantiating object by normal constructor call
 * 	  then the client has to use constructor and if by chance product has too many fields then client
 * 	  has to take care of all the fields
 *
 * 	Disadvantages
 * 	If the client needs to manually set each field, there is no automation.
 * */
public class CricketBatBuilder implements ICricketBatBuilder {
	

	// mandatory fields for creating a cricket bat
    String handleType;
	  String material;

	  // optional fields
	  // as of now we are providing default values in case client doesn't pass anything
	  String gripper = "default";
	  String colour = "default";
	  String stickers = "default";
	  
	  
	  
	@Override
	public CricketBat build() {

		// enforcing the client to provide the mandatory fields
		if(material == null || handleType == null)
			throw new IllegalArgumentException(" Material and handleType are mandatory for building cricket bat" +
					"\n please provide the material and handleType");
		
		return new CricketBat(this);
	}
	
	  public CricketBatBuilder HandleType(String handleType) {
			this.handleType = handleType;
			return this;
	  }



		public CricketBatBuilder Material(String material) {
			this.material = material;
			return this;
		}



		public CricketBatBuilder Gripper(String gripper) {
			this.gripper = gripper;
			return this;
		}



		public CricketBatBuilder Colour(String colour) {
			this.colour = colour;
			return this;
		}



		public CricketBatBuilder Stickers(String stickers) {
			this.stickers = stickers;
			return this;
		}


}
