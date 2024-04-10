package com.sb.inclass.project.sbinclassproject2.dto;

import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
public class EmployeeInfoDto implements Serializable {
    private String firstName;

    private String lastName;

    private String dob;

    private String gender;

    private String email;

    private String countryOfBirth;

    private List<EducationDetailsDto> educationDetailsDtos;

    public EmployeeInfoDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeInfoDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeInfoDto setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public EmployeeInfoDto setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public EmployeeInfoDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeInfoDto setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
        return this;
    }

    public EmployeeInfoDto setEducationDetails(List<EducationDetailsDto> educationDetails) {
        this.educationDetailsDtos = educationDetails;
        return this;
    }
}
