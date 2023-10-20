package com.tharuka.aad.guide_service.repository;

import com.tharuka.aad.guide_service.entity.Guide;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface GuideRepository extends MongoRepository<Guide, String> {
}
