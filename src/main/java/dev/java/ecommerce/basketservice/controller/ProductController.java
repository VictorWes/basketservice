package dev.java.ecommerce.basketservice.controller;



import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import dev.java.ecommerce.basketservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<PlatziProductResponse>> getAllProducts(){

        return ResponseEntity.ok(productService.getAllProducts());

    }

    @GetMapping({"/{id}"})

    public ResponseEntity<PlatziProductResponse> getProductById(@PathVariable Long id){

        return ResponseEntity.ok(productService.getProductById(id));
    }
}
