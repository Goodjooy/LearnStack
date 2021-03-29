package com.jacky.learnStack.models.database.repository;

import com.jacky.learnStack.models.database.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author,Long> {
    Optional<Author> findByEmail(String email);
}
