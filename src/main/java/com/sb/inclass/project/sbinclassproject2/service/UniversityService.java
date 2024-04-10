package com.sb.inclass.project.sbinclassproject2.service;

import com.sb.inclass.project.sbinclassproject2.dto.AddressDto;
import com.sb.inclass.project.sbinclassproject2.dto.UniversityDto;
import com.sb.inclass.project.sbinclassproject2.entity.University;
import com.sb.inclass.project.sbinclassproject2.mapper.Mapper;
import com.sb.inclass.project.sbinclassproject2.repository.UniversityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class UniversityService {
    private static final Logger logger = LoggerFactory.getLogger(UniversityService.class);

    @Autowired
    private Mapper mapper;

    @Autowired
    private UniversityRepository universityRepository;

    public void addUniversity(UniversityDto universityDto) {
        logger.info("Inside the add university method");
      University university =  mapper.mapUniversityDtoToUniversity(universityDto);
      universityRepository.save(university);
        logger.info("University saved successfully", universityDto);

    }

    public void insertSomeTestData() {
        List<University> universityList = IntStream.rangeClosed(4, 20)
                .peek(e -> System.out.println("Generating data " + e))
                .mapToObj(e -> new UniversityDto()
                        .setName("University" + e)
                        .setPhone("345-456-56" + e)
                        .setWebsiteAddress("www.university" + e + ".com")
                        .setAddressDto(new AddressDto()
                                .setAddress1("Address1" + e)
                                .setAddress2("Address2" + e)
                                .setAddress3("Address3" + e)
                                .setState("State" + e)
                                .setCity("City" + e)
                                .setZip(12334 + e)))
                .map(mapper::mapUniversityDtoToUniversity)
                .collect(Collectors.toList());

        for(University university: universityList) {
            universityRepository.save(university);
        }
    }

    @Cacheable(cacheNames = "universities")
    public List<UniversityDto> getAllUniversities() {
        List<University> universityList =  universityRepository.findAll();
       return  universityList.stream().map(mapper::mapUniversityToUniversityDto).collect(Collectors.toList());
    }

    @Cacheable(cacheNames = "universities", key = "#id")
    public UniversityDto getUniversityById(Long id) {
        University university = universityRepository.getReferenceById(id);
        return mapper.mapUniversityToUniversityDto(university);
    }

    @CacheEvict(cacheNames = "universities", key = "#id")
    public void deleteUniversityById(Long id) {
         universityRepository.deleteById(id);
    }

    public void updateUniversityDetails(Long id, UniversityDto universityDto){
        logger.info("Inside updateUniversityDetails");
       University university =  universityRepository.getReferenceById(id);
        logger.debug("Retrieved university details from database");

       if(university != null) {
         university = (mapper.mapUniversityDtoToUniversity(universityDto));
         logger.debug("After converting DTO to Entity");
         universityRepository.save(university);
         logger.info("Saved Entity to DB");
       }

    }

    public AddressDto getUniversityAddressByName(String name) {
        logger.info("inside {} getUniversityAddressByName {}", name , "");
        University university = universityRepository.findByName(name);

        if(university == null) return null;
        return  mapper.mapAddressToAddressDto(university.getAddress());
    }
}
