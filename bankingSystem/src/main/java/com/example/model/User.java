package com.example.model;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public abstract class User {
    private String  id;
    private String   fullName;
    private String   email;
    private String   password;
    private Boolean  isDeleted;
}