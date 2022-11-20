package com.sa.com.sho.springbootmicroservicegateway.controller;


import com.google.gson.JsonElement;
import com.sa.com.sho.springbootmicroservicegateway.manager.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gateway/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody JsonElement product){
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @DeleteMapping("${deleteId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long deleteId){
        productService.deleteProduct(deleteId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProduct(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

}
