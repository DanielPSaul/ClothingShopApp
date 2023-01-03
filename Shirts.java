
public class Shirts extends Clothing {
	
	private String shirtFit;
	
	
	
	public Shirts(int id, String brand, double price, String size, String fit) {
		super(id, brand, price, size);
		shirtFit = fit;
	}

	
	public void setFit(String fit) {
		shirtFit = fit;
	}
	
	public String getFit() {
		return shirtFit;
	}
	
	@Override
	public void printItem() {
		super.printItem();
		System.out.println("Fit: " + shirtFit);
	}

}
