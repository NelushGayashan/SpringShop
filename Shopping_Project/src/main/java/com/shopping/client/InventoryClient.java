package com.shopping.client;

import com.shopping.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "inventory-service", url = "http://localhost:8081")
public interface InventoryClient {
      @GetMapping("/products")
      List<Product> getProducts();
}
