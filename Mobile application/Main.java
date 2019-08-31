class MyModel1 {
     //write your logic here
	int camera = 2;
	public void model() {
		System.out.println("Features of MyModel 1");
		System.out.println("Camera mega pixels: "+2);
	}
}
class MyModel2 extends MyModel1 {
     //write your logic here
	int camera = 5;
	String lock = "Fingerprint";
	int display = 5;
	public void model() {
		System.out.println("Features of MyModel 2");
		System.out.println("Camera mega pixels: "+camera);
		System.out.println("Lock mechanism: "+lock);
      System.out.println("Display size: "+display);
	}
	
}
class MyModel2T extends MyModel2 {
     //write your logic here
	int camera = 16;
	String lock = "Fingerprint";
	int display = 6;
	public void model() {
		System.out.println("Features of MyModel 2T");
		System.out.println("Camera mega pixels: "+camera);
		System.out.println("Lock mechanism: "+lock);
      System.out.println("Display size: "+display);
	}
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
    	MyModel1 m1 = new MyModel1();
    	MyModel2 m2 = new MyModel2();
    	MyModel2T m3 = new MyModel2T();
    	
    	m1.model();
    	m2.model();
    	m3.model();
    }
}