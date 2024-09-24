package com.funky.Funky.repository;

import com.funky.Funky.model.Follower;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FollowerRepository extends MongoRepository<Follower, String> {
}
