package com.sb.inclass.project.sbinclassproject2.controller;

import com.sb.inclass.project.sbinclassproject2.dto.AddressDto;
import com.sb.inclass.project.sbinclassproject2.dto.UniversityDto;
import com.sb.inclass.project.sbinclassproject2.service.UniversityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/university")
@Slf4j
public class UniversityController {


    @Autowired
    private UniversityService universityService;

    @PostMapping("/addUniversity")
    public String addUniversity(@RequestBody UniversityDto universityDto) {
        log.info("inside addUniversity {}", universityDto.getName());
        universityService.addUniversity(universityDto);
        return "Saved Successfully!!";
    }

    @PostMapping("/insertUniversityTestData")
    public void insertTestData() {
        universityService.insertSomeTestData();
    }

    @GetMapping("/getAllUniversities")
    public List<UniversityDto> getAllUniversities() {
       return universityService.getAllUniversities();
    }

    @GetMapping("/getUniversityById")
    public UniversityDto getUniversityById(@RequestParam Long id) {
        return universityService.getUniversityById(id);
    }

    @PutMapping("/updateUniversityDetails/{id}")
    public void updateUniversityDetails(@PathVariable Long id, @RequestBody UniversityDto universityDto) {
        universityService.updateUniversityDetails(id, universityDto);
    }

    @DeleteMapping("/deleteUniversityById")
    public void deleteUniversityById(@RequestParam Long id) {
         universityService.deleteUniversityById(id);
    }


    @GetMapping("/getUniversityAddressByName")
    public AddressDto getUniversityAddressByName(@RequestParam String name) {
        return universityService.getUniversityAddressByName(name);
    }



}
