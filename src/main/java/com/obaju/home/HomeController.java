package com.obaju.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.obaju.product.Product;
import com.obaju.product.Products;

@Controller
public class HomeController {

	@Autowired
	private Products products;
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("Redirecting to index page");
		List<Product> list = products.all();
		System.out.println("List: " + list);
		return "index";
	}
	
}
