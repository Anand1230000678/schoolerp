package com.SER.SER_app.people_model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;

    private String firstName;
    private String lastName;
    private String phone;
    private LocalDate hireDate;
    private String department;      // e.g. "Administration", "IT"
    private String designation;     // e.g. "Principal", "Clerk"

    @ElementCollection
    private Set<String> rolePermissions; // e.g. "MANAGE_FEES", "MANAGE_USERS"

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
