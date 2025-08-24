package dev.java.ecommerce.basketservice.service;

import dev.java.ecommerce.basketservice.client.PlatziStoreCliente;
import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final PlatziStoreCliente platziStoreCliente;



    public List<PlatziProductResponse> getAllProducts(){

        return platziStoreCliente.getAllProducts();

    }

    public PlatziProductResponse getProductById(Long id){
        return platziStoreCliente.getProductById(id);
    }


}
