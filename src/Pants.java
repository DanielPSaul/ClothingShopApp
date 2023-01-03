
public class Pants extends Clothing {
	
	
	private String dimensions;
	

	public Pants(int id, String brand, double price, String size, String dim) {
		super(id, brand, price, size);
		dimensions = dim;
	}
	
	
	public void setDimensions(String dim) {
		dimensions = dim;
	}
	
	public String getDimensions() {
		return dimensions;
	}
	
	
	@Override
	public void printItem() {
		super.printItem();
		System.out.println("Dimensions: " + dimensions);
	}

}
