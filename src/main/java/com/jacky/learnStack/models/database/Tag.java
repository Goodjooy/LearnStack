package com.jacky.learnStack.models.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false,unique = true,length = 8)
    String tagName;

}
