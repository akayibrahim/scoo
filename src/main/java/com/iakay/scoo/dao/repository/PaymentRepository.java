package com.iakay.scoo.dao.repository;

import com.iakay.scoo.dao.model.Payment;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by iakay on 2019-12-22.
 */
@EnableScan
@Repository
public interface PaymentRepository extends CrudRepository<Payment, String> {
    Optional<Payment> findById(String id);

    Payment save(Payment payment);

    void deleteById(String id);
}
