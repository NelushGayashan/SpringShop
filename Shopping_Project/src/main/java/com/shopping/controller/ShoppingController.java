package com.shopping.controller;

import com.shopping.client.InventoryClient;
import com.shopping.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shopping")
public class ShoppingController {

      private final InventoryClient inventoryClient;

      public ShoppingController(InventoryClient inventoryClient) {
            this.inventoryClient = inventoryClient;
      }

      @GetMapping("/products")
      public List<Product> getProducts() {
            return inventoryClient.getProducts();
      }
}
