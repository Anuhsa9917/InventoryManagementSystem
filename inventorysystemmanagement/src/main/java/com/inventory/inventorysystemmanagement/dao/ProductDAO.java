package com.inventory.inventorysystemmanagement.dao;

import com.inventory.inventorysystemmanagement.Product;

public interface ProductDAO {
    Product getProductById(int id); // Method signature
    void updateProduct(Product product);
    void deleteProductById(int id);
	void saveProduct(Product product);
}

