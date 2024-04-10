package com.sb.inclass.project.sbinclassproject2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.io.Serializable;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto implements Serializable {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    private String address1;

    private String address2;

    private String address3;

    private String state;

    private String city;

    private Integer zip;

    public AddressDto setId(Long id) {
        this.id = id;
        return this;
    }

    public AddressDto setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public AddressDto setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public AddressDto setAddress3(String address3) {
        this.address3 = address3;
        return this;
    }

    public AddressDto setState(String state) {
        this.state = state;
        return this;
    }

    public AddressDto setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressDto setZip(Integer zip) {
        this.zip = zip;
        return this;
    }
}
