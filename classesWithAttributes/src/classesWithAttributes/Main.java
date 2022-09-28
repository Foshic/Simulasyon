package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		product._name="Laptop";
		product._id=1;
		product._description="Asus Laptop";
		product._price=5000;
		product._stockAmount=3;
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		System.out.println(product.get_kod());
		

	}

}
