import java.util.HashSet;

public class Customer {
	
	private int custID = 000;
	public static int custCount = 0;
	private String fullName;
	private String email;
	private long phoneNum;
	private HashSet<Order> orders;
	
	
	public Customer(int id, String name, String email, long phone)
	{
		custID = id;
		fullName = name;
		this.email = email;
		phoneNum = phone;
		orders = new HashSet<Order>();
		custID = custCount;
		custCount++;
	}
	
	
	public void setID(int id) {
		custID = id;
	}
	
	
	public int getID() {
		return custID;
	}
	
	
	public void setName(String name) {
		fullName = name;
	}
	
	
	public String getName() {
		return fullName;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getEmail() {
		return this.email;
	}
	
	
	public void setPhone(long phone) {
		phoneNum = phone;
	}
	
	
	public long getPhone() {
		return phoneNum;
	}
	
	
	public void placeOrder(Order o) {
		orders.add(o);
	}
	
	
	public void cancelOrder(Order o) {
		orders.remove(o);
	}
	
	
	public void showAllOrders() {
		System.out.println("--YOUR PAST ORDERS--");
		for (Order o: orders) {
			System.out.println("ID: " + o.getID());
			System.out.println("Total: $" + o.getTotal());
			System.out.println("PAID?: " + o.getStatus());
		}
		System.out.println();
	}
	
	public void printInfo() {
		System.out.println("--CUSTOMER OF CCA--");
		System.out.println("Customer ID: " + custID);
		System.out.println("Customer Name: " + fullName);
		System.out.println();
		System.out.println("--CONTACT INFO--");
		System.out.println("Email: " + this.email);
		System.out.println("Phone: " + phoneNum);
	}
	

}
