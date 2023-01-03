import java.util.HashMap;
import java.util.Map;

public class Store {
	
	public static HashMap<Integer, Clothing> inventory;
	private double[] prices;
	
	
	public Store() 
	{
		inventory = new HashMap<Integer, Clothing>();
		prices = new double[9];
		prices[0] = 65.00;
		prices[1] = 100.00;
		prices[2] = 70.00;
		prices[3] = 150.00;
		prices[4] = 120.00;
		prices[5] = 110.00;
		prices[6] = 350.00;
		prices[7] = 275.00;
		prices[8] = 100.00;
	}
	
	
	public void viewStoreHours() {
		System.out.println("--|Custom Clothing Athens Store Hours|--");
		System.out.println("Monday: 7:00 AM--9:00 PM");
		System.out.println("Tuesday: 7:00 AM--9:00 PM");
		System.out.println("Wednesday: 7:00 AM--9:00 PM");
		System.out.println("Thursday: 7:00 AM--9:00 PM");
		System.out.println("Friday: 7:00 AM--5:00 PM");
		System.out.println("Saturday: 10:00 AM--4:00 PM");
		System.out.println("Sunday: CLOSED");
		System.out.println();
	}
	
	
	public void viewPriceTags() {
		System.out.println("--AVAILABLE PRICE TAGS--");
		for (int i = 0; i < prices.length; ++i) {
			System.out.println("Tag " + i + ": " + "$" + prices[i]);
		}
		System.out.println();
	}
	
	
	public void addItem(int id, String brand, double price, String size)
	{	
		Clothing item = new Clothing(id, brand, price, size);
		inventory.put(item.getID(), item);
	}
	
	public void addItem(int id, String brand, double price, int shoeSize) {
		Clothing item = new Clothing(id, brand, price, shoeSize);
		inventory.put(item.getID(), item);
	}
	
	
	public void removeItem(int id) {
		inventory.remove(id);
	}
	
	
	public Clothing getItem(int id) {
		return inventory.get(id);
	}
	
	
	public void printInventory() {
		System.out.println("--TOTAL INVENTORY--");
		for (Map.Entry entry: inventory.entrySet()) {
			((Clothing)entry.getValue()).printItem();
			System.out.println();
			}
		}
	

	
	
public static void main(String[] args) {
	
	
		//Scenario 1
		Store cca = new Store();
		
		cca.addItem(0, "Nike", 65.00, "Large");
		cca.addItem(1, "Gucci", 100.00, "Small");
		cca.addItem(2, "GAP", 70.00, "Large");
		
		cca.addItem(3, "Lululemon", 150.00, "Medium");
		cca.addItem(4, "Levi's", 120.00, "Large");
		cca.addItem(5, "American Eagle", 110.00, "Small");
		
		cca.addItem(6, "Louis Vuitton", 350.00, 10);
		cca.addItem(7, "Allbirds", 275.00, 12);
		cca.addItem(8, "Adidas", 100.00, 9);
		
		cca.printInventory();
		cca.viewStoreHours();
		cca.viewPriceTags();
		
		//Scenario 2
		Order order1 = new Order(001);
		Shirts item1 = new Shirts(1, "Nike", 65.00, "Large", "Tight");
		Shoes item2 = new Shoes(2, "Adidas", 100.00, 9, "Running");
		
		order1.addClothing(item1);
		order1.addClothing(item2);
		
		order1.viewOrder();
		
		Customer cust = new Customer(0, "Albert Einstein", "aeinstein@gmail.com", 6150981234L);
		cust.placeOrder(order1);
		cust.showAllOrders();
		
	
	

		


	}

}

