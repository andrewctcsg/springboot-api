package com.ctcglobal.mongodbtable.dal;

import com.ctcglobal.mongodbtable.model.User;

import java.util.List;

public interface UserDAL {
    List<User> getAllUsers();

    User getUserByEmail(String email);

    User getUserByFirstName(String first_name);

    User getUserByLastName(String last_name);

    User getUserByMobile(String mobile);

    User addNewUser(User user);

}
