package oopWithNLayerdApp.dataAccsess;

import oopWithNLayerdApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	public void add(Product product) {
		

	System.out.println("Hibernite ile veritabanına eklendi");
	}
}
		
		
	


