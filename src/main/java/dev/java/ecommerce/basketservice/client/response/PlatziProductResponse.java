package dev.java.ecommerce.basketservice.client.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.math.BigDecimal;

public record PlatziProductResponse(

        @Schema(type = "long", description = "id produto")
        Long id,
        @Schema(type = "string", description = "titulo produto")
        String title,
        @Schema(type = "number", description = "preço produto")
        BigDecimal price) implements Serializable {
}
