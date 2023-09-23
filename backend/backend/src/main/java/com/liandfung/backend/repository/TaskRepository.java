package com.liandfung.backend.repository;

import com.liandfung.backend.domain.Tasks;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Tasks, Long> {
    @Query(
            value = "SELECT t.* FROM tasks t INNER JOIN account a ON a.id = t.account_id WHERE a.email = :email",
            nativeQuery = true
    )
    Page<Tasks> findAllByEmail(@Param("email") String email, Pageable pageable);
}
