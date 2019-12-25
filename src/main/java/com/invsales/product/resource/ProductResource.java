package com.invsales.product.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invsales.product.domain.Product;
import com.invsales.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/create")
	public void createProduct(@RequestBody Product product) {
		productService.createProduct(product);
	}
	
	@GetMapping("/findById/{productId}")
	public Product findProductById(@PathVariable String productId) {
		Product product = productService.findProductById(productId);
		return product;		
	}
	
	@GetMapping("/findAll")
	public List<Product> findAllProducts(){
		List<Product> productList = productService.findAllProducts();		
		return productList;
	}

}
