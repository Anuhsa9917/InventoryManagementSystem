package com.inventory.inventorysystemmanagement.dao;

import com.inventory.inventorysystemmanagement.Order;

public interface OrderDAO {
    void saveOrder(Order order);
    Order getOrderById(int id); // Method signature
    void updateOrder(Order order);
    void deleteOrderById(int id);
}
