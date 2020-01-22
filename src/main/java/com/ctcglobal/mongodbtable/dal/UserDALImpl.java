package com.ctcglobal.mongodbtable.dal;

import com.ctcglobal.mongodbtable.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDALImpl implements UserDAL {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<User> getAllUsers() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public User getUserByEmail(String email) {
        Query query = new Query();
        query.addCriteria(Criteria.where("email"). is(email));
        return mongoTemplate.findOne(query, User.class);
    }

    @Override
    public User getUserByFname(String first_name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("fname"). is(fname));
        return mongoTemplate.findOne(query, User.class);
    }

    @Override
    public User getUserByLname(String last_name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("lname"). is(lname));
        return mongoTemplate.findOne(query, User.class);
    }

    @Override
    public User getUserByMobile(String mobile) {
        Query query = new Query();
        query.addCriteria(Criteria.where("mobile"). is(mobile));
        return mongoTemplate.findOne(query, User.class);
    }

    @Override
    public User addNewUser(User user) {
        mongoTemplate.save(user);
        return user;
    }

}
