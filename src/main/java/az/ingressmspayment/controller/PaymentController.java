package az.ingressmspayment.controller;

import az.ingressmspayment.model.request.CreatePaymentRequest;
import az.ingressmspayment.model.response.PaymentResponse;
import az.ingressmspayment.service.abstraction.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PaymentResponse pay(@RequestBody CreatePaymentRequest createPaymentRequest){
       return  paymentService.pay(createPaymentRequest);

    }

    @GetMapping("/orders/{orderId}")
    public PaymentResponse getPaymentId(@PathVariable Long orderId){
        return paymentService.getPaymentId(orderId);
    }

}
