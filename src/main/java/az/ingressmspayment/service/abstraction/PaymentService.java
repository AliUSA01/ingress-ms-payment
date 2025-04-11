package az.ingressmspayment.service.abstraction;

import az.ingressmspayment.model.request.CreatePaymentRequest;
import az.ingressmspayment.model.response.PaymentResponse;

public interface PaymentService {
    PaymentResponse pay(CreatePaymentRequest createPaymentRequest);


    PaymentResponse getPaymentId(Long orderId);
}
