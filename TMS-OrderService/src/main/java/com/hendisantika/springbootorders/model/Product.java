package com.hendisantika.springbootorders.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Product {
	@Id
	@Column(name = "productId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long productId;

	String productName;

	String productDescription;

	double unitPrice;

	@ManyToOne
	@JoinColumn(name = "orderId")
	OrderDetails orderDetails;

	public Product() {
	}

	public Product(String productName, String productDescription, double unitPrice, OrderDetails orderDetails) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.unitPrice = unitPrice;
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "productId = " + productId + ", productName = " + productName + ", productDescription = "
				+ productDescription + ", unitPrice = " + unitPrice;
	}
}