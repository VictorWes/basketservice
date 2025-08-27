package dev.java.ecommerce.basketservice.controller;

import dev.java.ecommerce.basketservice.controller.request.BasketRequest;
import dev.java.ecommerce.basketservice.controller.request.PaymentRequest;
import dev.java.ecommerce.basketservice.entity.Basket;
import dev.java.ecommerce.basketservice.service.BasketService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basket")
@RequiredArgsConstructor
@Tag(name = "Basket", description = "Recurso responsavel por gerenciar dados da controller Basket")
public class BasketController {

    private final BasketService basketService;

    @Operation(summary = "Buscar por Id", description = "Busca no banco de dados por Id")
    @ApiResponse(responseCode = "200", description = "Id localizado com sucesso",
    content = @Content(schema = @Schema(implementation = Basket.class)))
    @GetMapping("/{id}")
    public ResponseEntity<Basket> getBasketById(@PathVariable String id){
        return ResponseEntity.ok(basketService.getBasketById(id));
    }

    @Operation(summary = "Salvar Basket", description = "Metodo responsavel por salvar um novo produto")
    @ApiResponse(responseCode = "201", description = "Produto criado com sucesso",
            content = @Content(schema = @Schema(implementation = Basket.class)))
    @PostMapping
    public ResponseEntity<Basket> createBasket(@RequestBody BasketRequest request){

        return ResponseEntity.status(HttpStatus.CREATED).body(basketService.createBasket(request));

    }

    @Operation(summary = "Alterar Basket", description = "Metodo responsavel por alterar dados")
    @ApiResponse(responseCode = "200", description = "Produto alterado com sucesso",
            content = @Content(schema = @Schema(implementation = Basket.class)))
    @PutMapping("/{id}")
    public ResponseEntity<Basket> updateBasket(@PathVariable String id, @RequestBody BasketRequest request){

        return ResponseEntity.status(HttpStatus.OK).body(basketService.updateBasket(id, request));

    }

    @Operation(summary = "Alterar forma de pagamento", description = "Metodo responsavel por alterar forma de pagamento")
    @ApiResponse(responseCode = "200", description = "Forma de pagamento alterada com sucesso",
            content = @Content(schema = @Schema(implementation = Basket.class)))
    @PutMapping("/{id}/payment")
    public ResponseEntity<Basket> payBasket(@PathVariable String id, @RequestBody PaymentRequest request){

        return ResponseEntity.status(HttpStatus.OK).body(basketService.payBasket(id, request));

    }
    @Operation(summary = "Deletar conteudo", description = "Metodo responsavel por deletar conteudo")
    @ApiResponse(responseCode = "204", description = "conteudo delatado com sucesso",
            content = @Content(schema = @Schema(hidden = true)))
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletBasket(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
