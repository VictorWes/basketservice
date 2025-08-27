package dev.java.ecommerce.basketservice.controller.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
public record ProductRequest(
                            @Schema(type = "long", description = "id produto")
                             Long id,
                            @Schema(type = "integer", description = "quantidade produto")
                             Integer quantity) {
}
