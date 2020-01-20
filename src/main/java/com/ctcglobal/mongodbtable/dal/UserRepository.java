package com.ctcglobal.mongodbtable.dal;

import com.ctcglobal.mongodbtable.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    public User getUserByEmail(String email);
    public User getUserByFname(String first_name);
}