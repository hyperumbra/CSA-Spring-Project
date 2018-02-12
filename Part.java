package application;

public class Part {

	//Initialized Fields
	private String brandName;
	private String itemID;
	private String material;
	private String partName;
	private double price;

	//Full Constructor
	public Part(String brandName, String itemID, String material, String partName, double price) {
		this.brandName = brandName;
		this.itemID = itemID;
		this.material = material;
		this.partName = partName;
		this.price = price;
	}
	
	//Default Constructor
	public Part() {
		this.brandName = "";
		this.itemID = "";
		this.material = "";
		this.partName = "";
		this.price = 0;
	}

	//Partial Constructors
	public Part(String partName) {
		this.partName = partName;
	}

	public Part(String brandName, String partName) {
		this.brandName = brandName;
		this.partName = partName;
	}

	public Part(String brandName, String material, String partName) {
		this.brandName = brandName;
		this.material = material;
		this.partName = partName;
	}

	public Part(String brandName, String itemID, String material, String partName) {
		this.brandName = brandName;
		this.itemID = itemID;
		this.material = material;
		this.partName = partName;
	}

	public Part(String partName, double price) {
		this.partName = partName;
		this.price = price;
	}

	public Part(String brandName, String partName, double price) {
		this.brandName = brandName;
		this.partName = partName;
		this.price = price;
	}

	public Part(String brandName, String material, String partName, double price) {
		this.brandName = brandName;
		this.material = material;
		this.partName = partName;
		this.price = price;
	}

	//Getters & Setters
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}