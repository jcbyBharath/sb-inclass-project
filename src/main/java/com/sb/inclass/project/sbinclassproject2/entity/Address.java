package com.sb.inclass.project.sbinclassproject2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    private String address1;

    private String address2;

    private String address3;

    private String state;

    private String city;

    private Integer zip;
}
