package com.sb.SpringBootMay2026.transactionalTut.repository;

import com.sb.SpringBootMay2026.transactionalTut.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
