package com.example.JDB_new.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="cards")
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="card_id")
    private UUID id;

    @Column(name="card_number")
    private String CardNumber  ;

    @Column(name="card_expiry_date")
    private LocalDate CardExpiryDate;

    @Column(name = "CVV")
    private String cvv;

    @ManyToMany
    private Set<Card> cards = new HashSet();
}

