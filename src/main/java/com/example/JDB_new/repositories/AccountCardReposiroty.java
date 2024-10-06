package com.example.JDB_new.repositories;

import com.example.JDB_new.Models.AccountCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountCardReposiroty extends JpaRepository<AccountCard, UUID> {
}
