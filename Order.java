import java.util.ArrayList;


public class Order {
	
	private ArrayList<Clothing> orderCart;
	private int orderID = 000;
	public static int orderCount = 0;
	private double orderTotal = 0.0;
	private boolean orderStatus = false;
	
	
	public Order(int id) 
	{
		orderID = id;
		orderCart = new ArrayList<Clothing>();
		orderCount = orderID;
		orderCount++;
	}
		
	
	public void setID(int id) {
		orderID = id;
	}
	
	
	public int getID() {
		return orderID;
	}
	
	
	public double getTotal() {
		return orderTotal;
	}
	
	
	public void setStatus(boolean status) {
		orderStatus = status;
	}
	
	
	public boolean getStatus() {
		return orderStatus;
	}
	
	
	public void addClothing(Clothing item) {
		orderCart.add(item);
		orderTotal += item.getPrice();
	}
	
	
	public void removeClothing(Clothing item) {
		orderCart.remove(item);
		orderTotal -= item.getPrice();
	}
	
	
	public void viewOrder() {
		System.out.println("  --CCA ORDER--  ");
		System.out.println("Order ID: " + orderID);
		System.out.println("Total: $" + orderTotal);
		
		System.out.println("Cart:");
		for (Clothing clothingItem : orderCart) {
			System.out.println();
			clothingItem.printItem();
		}
		
		System.out.println();
		
		if (orderStatus == true) {
			System.out.println("PAID");
		}
		if (orderStatus == false) {
			System.out.println("NOT PAID");
		}
		
		System.out.println();
	}
	
}
