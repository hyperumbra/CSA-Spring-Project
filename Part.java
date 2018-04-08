package application;

public class Part {

	//Fields
	String partType;
	String partName;
	String brandName;
	String itemID;
	String material;
	double price;
	
	//Default Constructor
	Part(){
		partType = "";
		partName = "";
		brandName = "";
		itemID = "";
		material = "";
		price = 0;
	}
	
	//Full Constructor
	Part(String partType, String partName, String brandName, String itemID, String material, double price){
		this.partType = partType;
		this.partName = partName;
		this.brandName = brandName;
		this.itemID = itemID;
		this.material = material;
		this.price = price;
	}
	
}