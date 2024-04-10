package com.sb.inclass.project.sbinclassproject2.controller;

import com.sb.inclass.project.sbinclassproject2.dto.EmployeeRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee-education-details")
public class EmployeeEducationDetailsController {

    @PostMapping("/addEducationDetails")
    public void addEducationDetails() {

    }

    @PostMapping("/getEducationDetails")
    public void getEducationDetails(@RequestBody EmployeeRequest employeeRequest) {


    }

}
