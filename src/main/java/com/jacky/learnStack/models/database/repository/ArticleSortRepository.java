package com.jacky.learnStack.models.database.repository;

import com.jacky.learnStack.models.database.Article;
import com.jacky.learnStack.models.database.Series;
import com.jacky.learnStack.models.database.SeriesArticleSort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleSortRepository extends JpaRepository<SeriesArticleSort,Long> {
    List<SeriesArticleSort> findBySeriesOrderBySortIndex(Series series);

    List<SeriesArticleSort>findByArticle(Article article);
}
