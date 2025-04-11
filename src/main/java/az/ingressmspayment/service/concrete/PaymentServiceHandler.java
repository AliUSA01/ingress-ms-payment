package az.ingressmspayment.service.concrete;

import az.ingressmspayment.dao.repository.PaymentRepository;
import az.ingressmspayment.exception.NotFoundException;
import az.ingressmspayment.model.request.CreatePaymentRequest;
import az.ingressmspayment.model.response.PaymentResponse;
import az.ingressmspayment.service.abstraction.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static az.ingressmspayment.mapper.PaymentMapper.PAYMENT_MAPPER;

@Service
@RequiredArgsConstructor
public class PaymentServiceHandler implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public PaymentResponse pay(CreatePaymentRequest createPaymentRequest) {
        var paymentEntity = PAYMENT_MAPPER.
                buildPaymentEntity(createPaymentRequest);

         paymentRepository.save(paymentEntity);
         return PAYMENT_MAPPER.buildPaymentResponse(paymentEntity);
    }

    @Override
    public PaymentResponse getPaymentId(Long orderId) {
        return paymentRepository.findByOrderId(orderId)
                .map(PAYMENT_MAPPER::buildPaymentResponse)
                .orElseThrow(()->
                        new NotFoundException("Payment not found with orderId: " + orderId));
    }


}
