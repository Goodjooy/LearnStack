package com.jacky.learnStack.models.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    Long id;

    //authentication
    @Column(nullable = false,length = 16)
    String name;
    @Column(nullable = false,length = 128)
    String email;
    @Column(nullable = false,length = 64)
    String password;
}
