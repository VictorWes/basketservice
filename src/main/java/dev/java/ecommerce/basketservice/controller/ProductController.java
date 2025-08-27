package dev.java.ecommerce.basketservice.controller;



import dev.java.ecommerce.basketservice.client.response.PlatziProductResponse;
import dev.java.ecommerce.basketservice.entity.Basket;
import dev.java.ecommerce.basketservice.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
@Tag(name = "Product Platzi", description = "Recurso responsavel por gerenciar dados da controller product utilizando a API Platzi")
public class ProductController {

    private final ProductService productService;

    @Operation(summary = "Buscar todos produtos", description = "Busca todas produtos na API externa Platzi")
    @ApiResponse(responseCode = "200", description = "produtos localizados com sucesso",
            content = @Content(schema = @Schema(implementation = PlatziProductResponse.class)))
    @GetMapping
    public ResponseEntity<List<PlatziProductResponse>> getAllProducts(){

        return ResponseEntity.ok(productService.getAllProducts());

    }


    @Operation(summary = "Buscar por Id", description = "Busca na API extena Platzi o produto por ID")
    @ApiResponse(responseCode = "200", description = "Id localizado com sucesso",
            content = @Content(schema = @Schema(implementation = PlatziProductResponse.class)))
    @GetMapping({"/{id}"})
    public ResponseEntity<PlatziProductResponse> getProductById(@PathVariable Long id){

        return ResponseEntity.ok(productService.getProductById(id));
    }
}
