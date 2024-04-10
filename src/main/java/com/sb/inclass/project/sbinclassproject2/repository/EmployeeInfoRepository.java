package com.sb.inclass.project.sbinclassproject2.repository;

import com.sb.inclass.project.sbinclassproject2.entity.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Long> {
}
