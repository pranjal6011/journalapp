package com.pranjal.journalapp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pranjal.journalapp.entity.User;

public interface UserRepository extends MongoRepository<User, ObjectId>{
    User findByUserName(String userName);
    void deleteByUserName(String userName);
}
