package com.sb.inclass.project.sbinclassproject2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    private Long id;

    private String name;

    private String phone;

    private String websiteAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    private Address address;
}
