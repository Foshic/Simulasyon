package oopWithNLayerdApp.buisness;

import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccsess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.loggers= loggers;
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception {
		if (product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz");
		}

		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}
			
		}

	}


