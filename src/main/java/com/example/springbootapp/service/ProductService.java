package com.example.springbootapp.service;

import com.example.springbootapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  public List<Product> getProducts() {
    Product p = new Product();
    p.setName("First Product");

    Product p2 = new Product();
    p2.setName("Second Product");
    return List.of(p, p2);
  }
}
