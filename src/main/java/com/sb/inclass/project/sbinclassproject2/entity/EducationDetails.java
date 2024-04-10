package com.sb.inclass.project.sbinclassproject2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edu_id")
    private Long id;

    private Integer educationLevel;

    private LocalDate fromDate;

    private LocalDate toDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_emp_id")
    private EmployeeInfo employeeInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_univ_id")
    private University university;
}
