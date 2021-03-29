package com.jacky.learnStack.models.database;

import javax.persistence.*;

@Entity
@Table(
        indexes = {
                @Index(columnList = "article_id,series_id")
        }
)
public class SeriesArticleSort {
    @Id
    @GeneratedValue
    Long id;

    Integer sortIndex;

    @ManyToOne
    @JoinColumn(name = "article_id")
    Article article;

    @ManyToOne
    @JoinColumn(name = "series_id")
    Series series;
}
