package com.jacky.learnStack.models.database.repository;

import com.jacky.learnStack.models.database.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag,Long> {
    Optional<Tag>findByTagName(String name);

}
