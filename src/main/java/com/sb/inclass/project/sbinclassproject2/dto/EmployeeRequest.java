package com.sb.inclass.project.sbinclassproject2.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeRequest {

    private String fName;

    private String lName;

    private LocalDate dob;
}
