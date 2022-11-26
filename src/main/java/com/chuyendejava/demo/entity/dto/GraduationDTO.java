package com.chuyendejava.demo.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

@Getter
@Setter
public class GraduationDTO {
    //graduation
    private String idGraduation;
    @NotEmpty(message = "{NotEmpty.greduationSystem}")
    private String greduationSystem;
//    @NotEmpty(message = "{NotEmpty.dateGreduation}")

    @NotNull(message = "{NotNull.dateGreduation}")
    private Date dateGreduation;
    @NotEmpty(message = "{NotEmpty.greduationType}")
    private String greduationType;

    //school
    private String idSchool;

    //student
//    @NotEmpty(message = "{NotEmpty.idStudent}")
//    @NotEmpty(message = "{NotEmpty.idStudent}")
    private Long idStudent;
    @NotEmpty(message = "{NotEmpty.nameStudent}")
    private String nameStudent;
    @Email(message = "{Invalid.emailStudent}")
    @NotEmpty(message = "{NotEmpty.emailStudent}")

    private String emailStudent;
//    @Email(message = "{NotEmpty.phoneStudent}")
    @NotEmpty(message = "{NotEmpty.phoneNumber}")
    private String phoneStudent;
    @NotEmpty(message = "{NotEmpty.addrStudent}")
    private String addrStudent;
    //major
    private Long idMajor;


    public GraduationDTO(String idGraduation, String greduationSystem, Date dateGreduation, String greduationType, String idSchool, Long idStudent, String nameStudent, String emailStudent, String phoneStudent, String addrStudent, Long idMajor) {
        this.idGraduation = idGraduation;
        this.greduationSystem = greduationSystem;
        this.dateGreduation = dateGreduation;
        this.greduationType = greduationType;
        this.idSchool = idSchool;
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.emailStudent = emailStudent;
        this.phoneStudent = phoneStudent;
        this.addrStudent = addrStudent;
        this.idMajor = idMajor;
    }

    public GraduationDTO() {
    }
}
