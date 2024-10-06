package com.example.JDB_new.Models;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.UUID;

@Entity
@Table(name="account_card")
public class AccountCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;
}
