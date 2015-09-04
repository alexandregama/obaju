package com.obaju.home;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.obaju.product.Product;
import com.obaju.product.Products;

@Repository
public class HibernateProductsDao implements Products {

	@Override
	public List<Product> all() {
		return Arrays.asList(new Product());
	}

}
