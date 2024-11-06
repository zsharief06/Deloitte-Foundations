package com.cloudthat.productsapp.controller;

import com.cloudthat.productsapp.entity.Product;
import com.cloudthat.productsapp.model.ApiResponse;
import com.cloudthat.productsapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }

//    @GetMapping("/products/{productId}")
//    public Product getProductByName(@PathVariable("productId") Long productId){
//