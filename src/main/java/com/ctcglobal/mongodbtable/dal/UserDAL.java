package com.ctcglobal.mongodbtable.dal;

import com.ctcglobal.mongodbtable.model.User;

import java.util.List;

public interface UserDAL {
    List<User> getAllUsers();

    User getUserByEmail(String email);

    User getUserByName(String fname);

    User getUserByLastName(String lname);

    User getUserByMobile(String mobile);

    User addNewUser(User user);

}
