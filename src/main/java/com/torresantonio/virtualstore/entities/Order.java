package com.torresantonio.virtualstore.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codOrder;
	
	private String quantProd;
	private double totalPrice;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	private Client client;
	
	@OneToMany(mappedBy ="id.order")
	private Set <OrderItem> items = new HashSet<>();

	public Order() {

	}

	public Order(long codOrder, String quantProd, double totalPrice, Client client) {
		super();
		this.codOrder = codOrder;
		this.quantProd = quantProd;
		this.totalPrice = totalPrice;
		this.client = client;
	}

	public long getCodOrder() {
		return codOrder;
	}

	public void setCodOrder(long codOrder) {
		this.codOrder = codOrder;
	}

	public String getquantProd() {
		return quantProd;
	}

	public void setquantProd(String quantProd) {
		this.quantProd = quantProd;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	public Set<OrderItem> getItems(){
		return items;
	}
	public Double getTotal() {
		double sum = 0.0;
		for(OrderItem x : items) {
			sum = sum + x.getSubTotal();
			
		}
		return sum;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codOrder ^ (codOrder >>> 32));
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
		Order other = (Order) obj;
		if (codOrder != other.codOrder)
			return false;
		return true;
	}

}