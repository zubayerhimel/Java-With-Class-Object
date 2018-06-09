
public class Main {

	public static void main(String[] args) {

		Customer obj = new Customer();
		
		System.out.println("Enter name: ");
		obj.setName();
		System.out.println("Enter age:");
		obj.setAge();
		System.out.println("Enter address:");
		obj.setAddress();
		System.out.println("Enter phone number:");
		obj.setPhonenumber();
		System.out.println("Enter customer type:");
		obj.setCustomerType();
		System.out.println("Enter purchase item: ");
		obj.setPurchaseItem();
		
		obj.pirntPerson();
		obj.printCustomer();
		
		

	}

}
