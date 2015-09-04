package com.obaju.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", length = 100, nullable = false)
	private String name;
	
	@Column(name = "picture", length = 100, nullable = false)
	private String picture; 
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", picture=" + picture
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPicture() {
		return picture;
	}
	
}
