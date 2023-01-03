
public class Clothing {

	protected double price;
	protected String brandCo;
	protected int shoeSize;
	protected String size;
	protected int itemID;
	public static int itemCount = 0;
	
		public Clothing(int id, String brand, double price, String size) 
		{
			itemID = id;
			brandCo = brand;
			this.size = size;
			this.price = price;
			itemCount = itemID;
			itemCount++;
		}
		
		public Clothing(int id, String brand, double price, int size)
		{
			itemID = id;
			brandCo = brand;
			shoeSize = size;
			this.price = price;
			itemID = itemCount;
			itemCount++;
		}
		
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public double getPrice() {
			return this.price;
		}
		
		
		public void setBrand(String brand) {
			brandCo = brand;
		}
		
		
		public String getBrand() {
			return brandCo;
		}
		
		
		public void setSize(String size) {
			this.size = size;
		}
		
		
		public void setSize(int s) {
			shoeSize = s;
		}
		
		
		public int getSizeShoe() {
			return shoeSize;
		}
		
		
		public String getSize() {
			return this.size;
		}
		
		
		public void setID(int id) {
			itemID = id;
		}
		
		
		public int getID() {
			return itemID;
		}
		
		public void printItem() {
			System.out.println("Item ID: " + itemID);
			System.out.println("Brand: " + brandCo);
			System.out.println("Size: " + this.size);
			System.out.println("Price: $" + this.price);
		}
		
	
}
