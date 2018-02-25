package ClothStore;

public class Main {

	public static void main(String[] args) {

		ClothClass obj = new ClothClass();
		obj.Cost(10, 2);
		obj.discount();
		System.out.println("Discount is :"+obj.discount());
	}

}
