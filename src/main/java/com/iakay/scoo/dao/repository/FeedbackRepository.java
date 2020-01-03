package com.iakay.scoo.dao.repository;

import com.iakay.scoo.dao.model.Feedback;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by iakay on 2019-12-22.
 */
@EnableScan
@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, String> {
    Optional<Feedback> findById(String id);

    Feedback save(Feedback feedback);

    void deleteById(String id);
}