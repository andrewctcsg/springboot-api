package com.ctcglobal.mongodbtable.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String email;
    private String first_name;
    private String last_name;
    private String mobile;

    public String getEmail() {
        return email;
    }

    public String getFname() {
        return first_name;
    }

    public String getLname() {
        return last_name;
    }

    public String getMobile() {
        return mobile;
    }
}
