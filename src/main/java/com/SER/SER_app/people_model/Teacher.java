package com.SER.SER_app.people_model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tid;
    private String firstName;
    private String lastName;
    private String phone;
    private String qualification;

    @OneToOne
    private User user;
}
