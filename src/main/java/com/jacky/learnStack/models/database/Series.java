package com.jacky.learnStack.models.database;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(
        indexes = {
                @Index(columnList = "author_id"),
                @Index(columnList = "verify")
        }
)
public class Series {

    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "author_id")
    Author author;

    @Column(nullable = false,length = 64)
    String title;

    @Column(nullable = false,length = 256)
    String information;

    @OneToMany
    Set<SeriesArticleSort> articles;
    Boolean verify;
}
