package com.SER.SER_app.people_model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class ParentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;

    private String fatherName;
    private String motherName;
    private String guardianName;    // optional, if guardian is different
    private String contactNumber;
    private String alternateContact;
    private String address;
    @OneToMany(mappedBy = "parentProfile")
    private List<Student> children;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
