package com.example.springbootapp.service;

import com.example.springbootapp.model.Product;
import com.example.springbootapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }
  public List<Product> getProducts() {
    Product p = new Product();
    p.setName("First Product");

    Product p2 = new Product();
    p2.setName("Second Product");
    productRepository.saveAll(List.of(p, p2));
    return List.of(p, p2);
  }
}
