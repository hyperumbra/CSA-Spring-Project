package application;

public abstract class Part {

	//Fields
	String partName;
	String brandName;
	String itemID;
	String material;
	double price;
	
	//Default Constructor
	Part(){
		partName = "";
		brandName = "";
		itemID = "";
		material = "";
		price = 0;
	}
	
	//Full Constructor
	Part(String partName, String brandName, String itemID, String material, double price){
		this.partName = partName;
		this.brandName = brandName;
		this.itemID = itemID;
		this.material = material;
		this.price = price;
	}
	
}
