package com.inventory.inventorysystemmanagement;

import javax.persistence.*;
import java.util.Date; // Import Date class

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   

    private double totalAmount;

    // Getters and setters 
   
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
   

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

	public Order(int id, Date date, double totalAmount) {
		
	}

	public Order() {
		
	}

	@Override
	public String toString() {
		return "Order [id=" + id +  ", totalAmount=" + totalAmount + "]";
	}

   
}
