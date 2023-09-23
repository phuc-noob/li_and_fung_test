package com.liandfung.backend.repository;

import com.liandfung.backend.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository  extends JpaRepository<Account, Long> {
    Optional<Account> findByEmail(String email);
}
