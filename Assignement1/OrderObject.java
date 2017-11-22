
public class OrderObject {
	int orderno;
	String itemname;
	int quantity;
	String Status;
	static float tax=3.1416f;

	
	
	public OrderObject(int orderno, String itemname, int quantity, String status) {
		super();
		this.orderno = orderno;
		this.itemname = itemname;
		this.quantity = quantity;
		Status = status;
	}


	public OrderObject() {
		// TODO Auto-generated constructor stub
	}


	void printDetails() {
		System.out.println("orderno: "+orderno+"\n itemname: "+itemname+ "\nquantity:" +quantity);
	}
	
	//when using static variables use the static methods
	//we cannot access instance variables in a static method. 
	public static float gettaxrate() {
		return tax;
	}
	
	void additem(String itemname) {
		if(Status== "active") {
			if(itemname == "pen")
			{
				System.out.println("Your pen is Ordered");
				//New balance = balance - withdrawAmount;
				//System.out.println("New Balance:" +balance);
			}
			else
			{
				System.out.println("No other items availabe");
			}
			
		}
	}
	
	
	//overloading withdraw method

		void additem(String itemname,int quantity) {
			if(this.quantity==quantity) {
				if (quantity <= 10) {
					additem(itemname);
				}
			}else
			{
				System.out.println("Quantity cannot be processed");
			}
		}

}

