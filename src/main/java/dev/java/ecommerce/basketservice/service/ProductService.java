package dev.java.ecommerce.basketservice.service;

import dev.java.ecommerce.basketservice.client.PlatziStoreCliente;
import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final PlatziStoreCliente platziStoreCliente;


    @Cacheable(value = "products")
    public List<PlatziProductResponse> getAllProducts(){

        log.info("Getting all products");
        return platziStoreCliente.getAllProducts();


    }

    @Cacheable(value = "products", key = "#productId")
    public PlatziProductResponse getProductById(Long productId){
        log.info("Getting product by id {}", productId);
        return platziStoreCliente.getProductById(productId);
    }


}
