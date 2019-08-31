
public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
		Customers c = new Customers("Saakshi",9000000000L);
		Customers c1 = new Customers("Rahul",9000000001L);
		Suppliers s = new Suppliers("ABC Traders",8000000000L);
		Suppliers s1 = new Suppliers("XYZ Enterprises",8000000900L);
		Customers c2 = new Customers("Saakshi","Bangalore");
		Customers c3 = new Customers("Saakshi","Coimbatore");
		Suppliers s2 = new Suppliers("ABC Traders","Mumbai");
		Suppliers s3 = new Suppliers("ABC Traders","Delhi");
		Customers c4 = new Customers();
		Suppliers s4 = new Suppliers("ABC Traders",10);
		Suppliers s5 = new Suppliers("XYZ Enterprises",12);
		
		
		
		c.displayProfileDetails();
		c1.displayProfileDetails();
		s.displayProfileDetails();
		s1.displayProfileDetails();
		c2.editAddress();
		c3.editAddress();
		s2.editAddress();
		s3.editAddress();
		c4.placeOrder();
		s4.increseStockLevel();
		s5.increseStockLevel();
    }	
}

class Users {
		//write the logic for the class Users	
	int id;
	String name;
	long mobile;
	int itemStock;
	String address,dateOfBirth,gender,orderHistory,feedback;
	
}

class Customers extends Users{
		public Customers(String name, long mobile) {
			this.name=name;
			this.mobile=mobile;
			
		// TODO Auto-generated constructor stub
	}
		public Customers(String name, String address) {
			this.name=name;
			this.address=address;
			
		// TODO Auto-generated constructor stub
	}
		public Customers() {
			// TODO Auto-generated constructor stub
		}
		//write the logic for the class Customers	
	void editAddress() {
		System.out.println(name+", "+address);
	
	}
	void placeOrder() {
		System.out.println("Order placed successfully!");
		
	}
	void displayProfileDetails(){
		
		System.out.println(name+", "+ mobile);
		
		
	}
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
	public Suppliers(String name, long mobile) {
		this.name=name;
		this.mobile=mobile;
     	
	// TODO Auto-generated constructor stub
}
	public Suppliers(String name, String address) {
		this.name=name;
		this.address=address;
	}
	public Suppliers(String name, int itemStock) {
		this.name=name;
		this.itemStock=itemStock;
	}
	void editAddress() {
		System.out.println(name+", "+address);
		
	}
	void increseStockLevel() {
		
		System.out.println(name+", "+(itemStock+5));
		
	}
void displayProfileDetails(){
		
		System.out.println(name+", "+ mobile);
		
	}
}