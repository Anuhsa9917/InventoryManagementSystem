package com.inventory.inventorysystemmanagement.dao;

import com.inventory.inventorysystemmanagement.InventoryItem;

public interface InventoryItemDAO {
    void saveInventoryItem(InventoryItem inventoryItem);
    InventoryItem getInventoryItemById(int id); // Method signature
    void updateInventoryItem(InventoryItem inventoryItem);
    void deleteInventoryItemById(int id);
}
