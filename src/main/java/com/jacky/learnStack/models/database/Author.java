package com.jacky.learnStack.models.database;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue
    Long id;

    //authentication
    @Column(nullable = false,length = 16)
    String name;
    @Column(nullable = false,length = 128,unique = true)
    String email;
    @Column(nullable = false,length = 64)
    String password;

    //articles
    @OneToMany(fetch = FetchType.LAZY)
    Set<Article>articles;
    @OneToMany(fetch = FetchType.LAZY)
    Set<Series>series;
}
