package com.inventory.inventorysystemmanagement;

import com.inventory.inventorysystemmanagement.dao.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Create a session factory
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        // Create DAO instances
        ProductDAO productDAO = new ProductDAOImp1(sessionFactory);
        OrderDAO orderDAO = new OrderDAOImp1(sessionFactory);
        SupplierDAO supplierDAO = new SupplierDAOImp1(sessionFactory);
       InventoryItemDAO inventoryItemDAO = new InventoryItemDAOImp1(sessionFactory);

        // Perform CRUD operations
        
        //  Save a new product
        Product product = new Product();
        // Set product details
        product.setId(10001);
        product.setCategory("phone");
        product.setName("New Product");
        product.setDescription("Sample Description");
        product.setPrice(99.99);
        product.setQuantity(10);
        productDAO.saveProduct(product);

        //  Update a product
        Product existingProduct = productDAO.getProductById(1); // Assume product with ID 1 exists
        existingProduct.setPrice(130.00); // Update price
        productDAO.updateProduct(existingProduct);

        //  Delete a product
        productDAO.deleteProductById(-1); 
       //*************************** order entity****************************************
        Order order = new Order();
        order.setId(100);
        order.setTotalAmount(129.99);
        orderDAO.saveOrder(order);
        //update
        //Order existingOrder = orderDAO.getOrderById(1);
        //existingOrder.setTotalAmount();
        //orderDAO.updateOrder(existingOrder);
        //****************************inventory_Items************************************
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setId(100);
        inventoryItem.setQuantity(20);
        inventoryItemDAO.saveInventoryItem(inventoryItem);
        //update
        //InventoryItem existingInventoryItem = inventoryItemDAO.getInventoryItemById(1);
        //existingInventoryItem.setQuantity(-1);
        //inventoryItemDAO.updateInventoryItem(existingInventoryItem);
        //******************Supplier***********************************************
        Supplier supplier = new Supplier();
        supplier.setId(100);
        supplier.setContactInfo("kerala");
        supplier.setName("karnika");
        supplierDAO.saveSupplier(supplier);
        
        //update
        //Supplier existingSupplier = supplierDAO.getSupplierById(1);
        //existingSupplier.setContactInfo("");
        //existingSupplier.setName("");
       

        // Close the session factory
        sessionFactory.close();
    }
}

