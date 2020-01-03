package com.iakay.scoo.dao.repository;

import com.iakay.scoo.dao.model.Alert;
import com.iakay.scoo.dao.model.ScooterLog;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by iakay on 2019-12-22.
 */
@EnableScan
@Repository
public interface ScooterLogRepository extends CrudRepository<ScooterLog, String> {
    Optional<ScooterLog> findById(String id);

    ScooterLog save(ScooterLog scooterLog);

    void deleteById(String id);
}
