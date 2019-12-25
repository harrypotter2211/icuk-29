package com.invsales.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invsales.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{

}
