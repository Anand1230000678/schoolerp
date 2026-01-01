package com.SER.SER_app.people_model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)   // stores "ADMIN", "TEACHER", etc. in DB
    @Column(nullable = false)
    private Role role; // ADMIN, TEACHER, STUDENT, PARENT
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Student student;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private ParentProfile parentProfile;

}
