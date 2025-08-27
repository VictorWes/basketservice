package dev.java.ecommerce.basketservice.controller.request;

import dev.java.ecommerce.basketservice.entity.PaymentMethod;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest{
    @Schema(description = "Forma de pagamento do pedido")
    private PaymentMethod paymentMethod;

}
