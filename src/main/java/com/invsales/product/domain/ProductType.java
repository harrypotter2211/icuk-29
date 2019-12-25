package com.invsales.product.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_type")
public class ProductType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8661255063571727409L;

	@Id
	private int productTypeCode;
	
	private String description;

	public ProductType() {
	}

	public ProductType(int productTypeCode, String description) {
		super();
		this.productTypeCode = productTypeCode;
		this.description = description;
	}

	public int getProductTypeCode() {
		return productTypeCode;
	}

	public void setProductTypeCode(int productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductType [productTypeCode=" + productTypeCode + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductType other = (ProductType) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

}
