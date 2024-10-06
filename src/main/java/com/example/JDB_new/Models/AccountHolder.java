package com.example.JDB_new.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "account_holder")
public class AccountHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_holder_id")
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "account_holder_email")
    private String email;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "mother_name")
    private String motherName;
    


}
