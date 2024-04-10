package com.sb.inclass.project.sbinclassproject2.repository;

import com.sb.inclass.project.sbinclassproject2.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {


    University findByName(String name);

}
