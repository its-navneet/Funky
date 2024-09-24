package com.funky.Funky.repository;

import com.funky.Funky.model.Like;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikeRepository  extends MongoRepository<Like, String> {
}
