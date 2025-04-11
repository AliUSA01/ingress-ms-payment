package az.ingressmspayment.mapper;

import az.ingressmspayment.dao.entity.PaymentEntity;
import az.ingressmspayment.model.enums.PaymentStatus;
import az.ingressmspayment.model.request.CreatePaymentRequest;
import az.ingressmspayment.model.response.PaymentResponse;


public enum PaymentMapper {
    PAYMENT_MAPPER;

    public PaymentEntity buildPaymentEntity(CreatePaymentRequest createPaymentRequest){
        return PaymentEntity.builder()
                .referenceNumber(createPaymentRequest.getReferenceNumber())
                .amount(createPaymentRequest.getAmount())
                .orderId(createPaymentRequest.getOrderId())
                .paymentType(createPaymentRequest.getPaymentType())
                .paymentStatus(PaymentStatus.SUCCESS)
                .build();
    }


    public PaymentResponse buildPaymentResponse(PaymentEntity paymentEntity){
        return PaymentResponse.builder()
                .referenceNumber(paymentEntity.getReferenceNumber())
                .id(paymentEntity.getId())
                .orderId(paymentEntity.getOrderId())
                .amount(paymentEntity.getAmount())
                .paymentType(paymentEntity.getPaymentType())
                .paymentStatus(paymentEntity.getPaymentStatus())
                .createdAt(paymentEntity.getCreatedAt())
                .build();
    }
}
