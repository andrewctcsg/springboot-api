package com.ctcglobal.mongodbtable.controller;

import com.ctcglobal.mongodbtable.dal.UserRepository;
import com.ctcglobal.mongodbtable.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/")
public class UserController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        LOG.info("Getting all users.");
        return userRepository.findAll();
    }

    @RequestMapping(value = "/name/{fname}", method = RequestMethod.GET)
    public User getUser(@PathVariable String first_name) {
        LOG.info("Getting user with name: {}.", fname);
        return userRepository.getUserByFirst_name(fname);
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public User getemail(@PathVariable String email) {
        LOG.info("Getting user with email: {}.", email);
        return userRepository.getUserByEmail(email);
    }

   /* @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User addNewUsers(@RequestBody User user) {
        LOG.info("Saving user.");
        return userRepository.save(user);
    }*/

}
