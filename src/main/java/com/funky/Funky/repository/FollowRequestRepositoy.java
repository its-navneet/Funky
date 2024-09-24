package com.funky.Funky.repository;

import com.funky.Funky.model.FollowRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FollowRequestRepositoy extends MongoRepository<FollowRequest, String> {
}
