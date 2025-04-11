package az.ingressmspayment.model.response;

import az.ingressmspayment.model.enums.PaymentStatus;
import az.ingressmspayment.model.enums.PaymentType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentResponse {

    private Long id;

    private long orderId;

    private PaymentType paymentType;

    private String referenceNumber;

    private PaymentStatus paymentStatus;

    private BigDecimal amount;

    private LocalDateTime createdAt;

}
