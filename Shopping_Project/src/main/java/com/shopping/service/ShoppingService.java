package com.shopping.service;

import com.shopping.client.InventoryClient;
import com.shopping.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingService {
      @Autowired
      private InventoryClient inventoryClient;

      public List<Product> getAvailableProducts() {
            return inventoryClient.getProducts(); 
      }
}