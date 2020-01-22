package com.ctcglobal.mongodbtable.dal;

import com.ctcglobal.mongodbtable.model.User;

import java.util.List;

public interface UserDAL {
    List<User> getAllUsers();

    User getUserByEmail(String email);

    User getUserByFname(String fname);

    User getUserByLname(String lname);

    User getUserByMobile(String mobile);

    User addNewUser(User user);

}
