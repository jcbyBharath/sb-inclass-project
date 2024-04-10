package com.sb.inclass.project.sbinclassproject2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public @Data class EmployeeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    private String firstName;

    private String lastName;

    private String dob;

    private String gender;

    private String email;

    private String countryOfBirth;

    @OneToMany(mappedBy ="employeeInfo")
    private List<EducationDetails> educationDetails;

}
