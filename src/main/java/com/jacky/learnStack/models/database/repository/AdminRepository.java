package com.jacky.learnStack.models.database.repository;

import com.jacky.learnStack.models.database.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    Optional<Admin>findByEmail(String Email);
}
