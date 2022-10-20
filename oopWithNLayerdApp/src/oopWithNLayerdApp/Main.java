package oopWithNLayerdApp;

import oopWithNLayerdApp.buisness.ProductManager;
import oopWithNLayerdApp.core.logging.DatabaseLogger;
import oopWithNLayerdApp.core.logging.FileLogger;
import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccsess.HibernateProductDao;
import oopWithNLayerdApp.dataAccsess.JdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "Iphone Xr", 1000000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };

		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);

		ProductManager productManager1 = new ProductManager(new HibernateProductDao(), loggers);

		{

		}

		productManager1.add(product1);
		productManager.add(product1);

	}

}
