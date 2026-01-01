package com.SER.SER_app.people_model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sid;
    private String admissionNo;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private String phone;
    private String status;
    @OneToOne
    @JoinColumn(name = "user_uid")
    @JsonIgnore
    private User user;
    @ManyToOne
    @JoinColumn(name = "parent_profile_pid")
    @JsonIgnore
    private ParentProfile parentProfile;

}
