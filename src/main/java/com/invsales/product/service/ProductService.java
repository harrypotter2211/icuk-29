package com.invsales.product.service;

import java.util.List;

import com.invsales.product.domain.Product;

public interface ProductService {

		public void createProduct(Product product);
		
		public Product findProductById(String productId);
		
		public List<Product> findAllProducts();
}
