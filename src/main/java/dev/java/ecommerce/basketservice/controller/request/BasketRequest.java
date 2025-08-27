package dev.java.ecommerce.basketservice.controller.request;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record BasketRequest(
                            @Schema(type = "long", description = "id cliente")
                            Long clientId,
                            @Schema(type = "array", description = "lista de produtos")
                            List<ProductRequest> products) {
}
