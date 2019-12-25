package com.invsales.product.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invsales.product.domain.Product;
import com.invsales.product.repository.ProductRepository;
import com.invsales.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product findProductById(String productId) {
		Optional<Product> product = productRepository.findById(productId);
		return product.get();
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> productList = productRepository.findAll();
		return productList;
	}

}
