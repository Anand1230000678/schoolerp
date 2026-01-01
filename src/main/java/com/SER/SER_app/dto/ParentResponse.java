package com.SER.SER_app.dto;

import com.SER.SER_app.people_model.Student;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParentResponse {

    private String fatherName;
    private String motherName;
    private String guardianName;    // optional, if guardian is different
    private String contactNumber;
    private String alternateContact;
    private String address;
    private List<Student> children;
    private String email;
}
