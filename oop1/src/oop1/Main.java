package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set Value
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1");

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image1");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image1");

		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0562536236");
		individualCustomer.setCustomerNumber("12312312");
		individualCustomer.setFisrtName("Berkay");
		individualCustomer.setLastName("Erçetin");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompany("Kodlama.io");
		corporateCustomer.setPhone("87686867");
		corporateCustomer.setTaxNumber("3982748093274");
		corporateCustomer.setCustomerNumber("98767986");

		Customer[] customers = { individualCustomer, corporateCustomer };
		for (Customer customer : customers) {
			System.out.println(customer.getId());
			System.out.println(customer.getCustomerNumber());
			System.out.println(customer.getPhone());
			
		
		}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

