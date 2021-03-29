package com.jacky.learnStack.models.database.repository;

import com.jacky.learnStack.models.database.Article;
import com.jacky.learnStack.models.database.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface ArticleRepository extends JpaRepository<Article,Long> {
    List<Article> findByTitleContaining(String infix);

    List<Article>findByVerifyFalseOrderByModifiedTime();
    List<Article>findByVerifyTrueOrderByModifiedTime();

    List<Article>findByPrincipleTagInOrTagsIn(Set<Tag>pTags,Set<Tag>tags);


}
