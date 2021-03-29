package com.jacky.learnStack.models.database.repository;

import com.jacky.learnStack.models.database.Article;
import com.jacky.learnStack.models.database.Series;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeriesRepository extends JpaRepository<Series,Long> {
    List<Series> findByTitleContainingOrInformationContaining(String infix,String infix2);

    List<Series>findByVerifyFalse();
    List<Series>findByVerifyTrue();


}
