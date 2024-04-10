package com.sb.inclass.project.sbinclassproject2.mapper;

import com.sb.inclass.project.sbinclassproject2.common.EducationLevel;
import com.sb.inclass.project.sbinclassproject2.dto.AddressDto;
import com.sb.inclass.project.sbinclassproject2.dto.EducationDetailsDto;
import com.sb.inclass.project.sbinclassproject2.dto.EmployeeInfoDto;
import com.sb.inclass.project.sbinclassproject2.dto.UniversityDto;
import com.sb.inclass.project.sbinclassproject2.entity.Address;
import com.sb.inclass.project.sbinclassproject2.entity.EducationDetails;
import com.sb.inclass.project.sbinclassproject2.entity.EmployeeInfo;
import com.sb.inclass.project.sbinclassproject2.entity.University;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class Mapper {

    public EmployeeInfoDto mapEmployeeInfoToEmployeeDetailsDto(EmployeeInfo employeeInfo) {
        EmployeeInfoDto employeeInfoDto = new EmployeeInfoDto()
                .setFirstName(employeeInfo.getFirstName())
                .setLastName(employeeInfo.getLastName())
                .setDob(employeeInfo.getDob())
                .setEmail(employeeInfo.getEmail())
                .setCountryOfBirth(employeeInfo.getCountryOfBirth())
                .setGender(employeeInfo.getGender())
                .setEducationDetails(
                        employeeInfo.getEducationDetails()
                                .stream()
                                .map(this::mapEducationDetailsToEducationDetailsDto)
                                .collect(Collectors.toList()));

        return employeeInfoDto;

    }

    public EducationDetailsDto mapEducationDetailsToEducationDetailsDto(EducationDetails educationDetails) {

        EducationDetailsDto educationDetailsDto = new EducationDetailsDto()
                .setEducationLevel(EducationLevel.find(educationDetails.getEducationLevel()))
                .setUniversityDto(mapUniversityToUniversityDto(educationDetails.getUniversity()))
                .setFromDate(educationDetails.getFromDate())
                .setToDate(educationDetails.getToDate());

        return educationDetailsDto;
    }

    public UniversityDto mapUniversityToUniversityDto(University university) {

        UniversityDto universityDto = new UniversityDto()
                .setAddressDto(mapAddressToAddressDto(university.getAddress()))
                .setId(university.getId())
                .setName(university.getName())
                .setPhone(university.getPhone())
                .setWebsiteAddress(university.getWebsiteAddress());

        return universityDto;

    }

    public AddressDto mapAddressToAddressDto(Address address) {

        AddressDto addressDto = new AddressDto()
                .setId(address.getId())
                .setAddress1(address.getAddress1())
                .setAddress2(address.getAddress2())
                .setAddress3(address.getAddress3())
                .setCity(address.getCity())
                .setState(address.getState())
                .setZip(address.getZip());

        return addressDto;
    }

    public University mapUniversityDtoToUniversity(UniversityDto universityDto) {

        University university = new University();
        university.setAddress(mapAddressDtoToAddress(universityDto.getAddressDto()));
        university.setName(universityDto.getName());
        university.setPhone(universityDto.getPhone());
        university.setWebsiteAddress(universityDto.getWebsiteAddress());

        return university;
    }

    public Address mapAddressDtoToAddress(AddressDto addressDto) {

        Address address = new Address();
        address.setAddress1(addressDto.getAddress1());
        address.setAddress2(addressDto.getAddress2());
        address.setAddress3(addressDto.getAddress3());
        address.setCity(addressDto.getCity());
        address.setState(addressDto.getState());
        address.setZip(addressDto.getZip());

        return address;
    }


}

