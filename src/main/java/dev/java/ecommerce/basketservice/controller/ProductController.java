package dev.java.ecommerce.basketservice.controller;



import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<Void> getAllProducts(){

        return ResponseEntity.ok().build();

    }

    @GetMapping({"/id"})

    public ResponseEntity<Void> getProductById(@PathVariable Long id){

        return ResponseEntity.ok().build();
    }
}
