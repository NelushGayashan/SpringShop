package com.inventory.controller;

import com.inventory.model.Product;
import com.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

      @Autowired
      private ProductService productService;

      @PostMapping
      public Product saveProduct(@RequestBody Product product) {
            return productService.saveProduct(product);
      }

      @GetMapping
      public List<Product> getAllProducts() {
            return productService.getAllProducts();
      }

      @GetMapping("/{id}")
      public ResponseEntity<Product> getProductById(@PathVariable Long id) {
            return productService.getProductById(id)
                        .map(product -> ResponseEntity.ok().body(product))
                        .orElse(ResponseEntity.notFound().build());
      }

      @PutMapping("/{id}")
      public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
            return productService.getProductById(id)
                        .map(existingProduct -> {
                              // Update the product details
                              existingProduct.setName(productDetails.getName());
                              existingProduct.setQuantity(productDetails.getQuantity());
                              existingProduct.setPrice(productDetails.getPrice());
                              Product updatedProduct = productService.saveProduct(existingProduct);
                              return ResponseEntity.ok(updatedProduct);
                        })
                        .orElse(ResponseEntity.notFound().build());
      }

      @DeleteMapping("/{id}")
      public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
            productService.deleteProduct(id);
            return ResponseEntity.noContent().build();
      }
}
