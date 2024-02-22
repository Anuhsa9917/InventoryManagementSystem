package com.inventory.inventorysystemmanagement;
import javax.persistence.*;

@Entity
@Table(name = "inventory_items")
public class InventoryItem {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    @OneToOne
	    
	    @JoinColumn(name = "product_id")
	    private Product product;

	    private int quantity;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public InventoryItem() {
		
		}

		@Override
		public String toString() {
			return "InventoryItem [id=" + id + ", product=" + product + ", quantity=" + quantity + "]";
		}

	    

}
