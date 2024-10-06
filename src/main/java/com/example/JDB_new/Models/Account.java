package com.example.JDB_new.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="accounts")
@Getter
@Setter

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private UUID id;

    @Column(name = "account_balance")
    private Float balance;

    @Column(name = "account_status")
    private String status;


}
