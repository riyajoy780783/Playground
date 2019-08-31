import java.util.Scanner;

//import required packages here

class Item
{
  private int price;
  //create various method to return attribute value(s)
  
}
   
class Customer
{
  private String product;
  
  //create various method to return attribute value(s)
}

class Bill
{
  //implement your logic to calculate total price
	private int quantity;
	private int price;
	int billing(int price,int quantity) {
		this.price=price;
		this.quantity=quantity;
		int r=price*quantity;
		return r;
	}
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
   
    Scanner sc=new Scanner(System.in );
   String  item= sc.next();
    int price =sc.nextInt();
    int quantity=sc.nextInt();
    int u=obj.billing(price, quantity);
    System.out.println("Total Price is : "+u);
    
  }
}