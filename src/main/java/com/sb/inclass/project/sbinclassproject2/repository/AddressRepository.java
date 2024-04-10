package com.sb.inclass.project.sbinclassproject2.repository;

import com.sb.inclass.project.sbinclassproject2.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
