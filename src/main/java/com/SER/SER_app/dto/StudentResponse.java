package com.SER.SER_app.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
public class StudentResponse {
    private String admissionNo;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private String phone;
    private String status;
    private  String email;

}
