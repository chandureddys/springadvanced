package com.core.springadvanced.standalone.cllections;

import java.util.List;

public class Products {
	
	private List<String> productNames;

	public List<String> getProductNames() {
		return productNames;
	}

	public void setProductNames(List<String> productNames) {
		this.productNames = productNames;
	}

	@Override
	public String toString() {
		return "Proucts [productNames=" + productNames + "]";
	}

}
