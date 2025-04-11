package az.ingressmspayment.dao.repository;

import az.ingressmspayment.dao.entity.PaymentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PaymentRepository extends CrudRepository<PaymentEntity, Long> {

    Optional<PaymentEntity> findByOrderId(Long orderId);
}
