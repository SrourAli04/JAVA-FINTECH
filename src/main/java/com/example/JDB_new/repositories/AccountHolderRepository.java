package com.example.JDB_new.repositories;

import com.example.JDB_new.Models.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder, UUID> {
}
