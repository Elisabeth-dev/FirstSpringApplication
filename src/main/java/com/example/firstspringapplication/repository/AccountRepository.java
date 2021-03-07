package com.example.firstspringapplication.repository;

import com.example.firstspringapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
