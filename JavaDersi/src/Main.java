
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Product product=new Product(1,"Laptop","Asus Laptop",300,2,"Siyah");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(50000);
//		product.setStockAmount(3);
		
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getKod());
		

	}

}
