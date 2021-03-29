package com.jacky.learnStack.models.database;

import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "articles",
        indexes = {@Index(columnList = "pt_id"),
                @Index(columnList = "author_id"),
                @Index(columnList = "modified_time")})
public class Article {
    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false, length = 128)
    String title;

    @Column(nullable = false, length = 64)
    String fileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pt_id", nullable = false)
    Tag principleTag;

    @ManyToMany
    Set<Tag> tags;

    @LastModifiedBy
    @ManyToOne
    @JoinColumn(nullable = false, name = "author_id")
    Author author;

    @LastModifiedDate
    @Column(name = "modified_time")
    LocalDateTime modifiedTime;

    @Column(nullable = false)
    Boolean verify;
}
