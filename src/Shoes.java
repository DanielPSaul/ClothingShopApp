
public class Shoes extends Clothing {
	
	
	private String shoeActivity;
	
	
	public Shoes(int id, String brand, double price, int size, String activity) {
		super(id, brand, price, size);
		shoeSize = size;
		shoeActivity = activity;
	}
	
	
	public void setActivity(String activity) {
		shoeActivity = activity;
	}
	
	
	public String getActivity() {
		return shoeActivity;
	}
	
	
	
	@Override
	public void printItem() {
		System.out.println("Item ID: " + itemID);
		System.out.println("Brand: " + brandCo);
		System.out.println("Size: " + shoeSize);
		System.out.println("Price: $" + this.price);
		System.out.println("Activity: " + shoeActivity);
		
	}

}
