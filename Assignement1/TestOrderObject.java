
public class TestOrderObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderObject TOB=new OrderObject();
		TOB.printDetails();
		TOB.orderno=1;
		TOB.itemname="pen";
		TOB.quantity=2;
		TOB.Status="Active";
		TOB.printDetails();
		TOB.additem("pen");
		TOB.additem("pen",15);
		
	}

}
