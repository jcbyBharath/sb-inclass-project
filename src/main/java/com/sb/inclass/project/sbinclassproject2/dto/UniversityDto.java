package com.sb.inclass.project.sbinclassproject2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.io.Serializable;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UniversityDto implements Serializable {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    private String name;

    private String phone;

    private String websiteAddress;

    private AddressDto addressDto;

    public UniversityDto setId(Long id) {
        this.id = id;
        return this;
    }

    public UniversityDto setName(String name) {
        this.name = name;
        return this;
    }

    public UniversityDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UniversityDto setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
        return this;
    }

    public UniversityDto setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
        return this;
    }
}
