package az.ingressmspayment.model.request;

import az.ingressmspayment.model.enums.PaymentType;
import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CreatePaymentRequest {

    private Long orderId;

    private PaymentType paymentType;

    private BigDecimal amount;

    private String referenceNumber;

}
