package com.chuyendejava.demo.dto.mapper;

import com.chuyendejava.demo.dto.GraduationDTO;
import com.chuyendejava.demo.entity.Graduation;
import com.chuyendejava.demo.entity.Major;
import com.chuyendejava.demo.entity.School;
import com.chuyendejava.demo.entity.Student;
import com.chuyendejava.demo.reponsitories.SchoolRepository;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class graduationMapper {
    public static SchoolRepository schoolRepository;
    public static Graduation toEntity(GraduationDTO graduationDTO, Graduation graduation){

        Student student= new Student();
        student.setIdStudent(graduationDTO.getIdStudent());
        student.setAddress(graduationDTO.getAddrStudent());
        student.setName(graduationDTO.getNameStudent());
        student.setEmail(graduationDTO.getEmailStudent());
        student.setPhone(graduationDTO.getPhoneStudent());

        graduation.setDateGreduation(graduationDTO.getDateGreduation());
        graduation.setGreduationSystem(graduationDTO.getGreduationSystem());
        graduation.setGreduationType(graduationDTO.getGreduationType());

        graduation.setStudent(student);
        return graduation;
    }
    public static GraduationDTO toDTO(Graduation graduation){

        GraduationDTO graduationDTO = new GraduationDTO();
        //graduation
        graduationDTO.setIdGraduation(graduation.getIdGraduation());
        graduationDTO.setGreduationSystem(graduation.getGreduationSystem());
        graduationDTO.setDateGreduation(graduation.getDateGreduation());
        graduationDTO.setGreduationType(graduation.getGreduationType());

        //major
        graduationDTO.setIdMajor(graduation.getMajor().getIdMajor());
        //student
        graduationDTO.setAddrStudent(graduation.getStudent().getAddress());
        graduationDTO.setNameStudent(graduation.getStudent().getName());
        graduationDTO.setEmailStudent(graduation.getStudent().getEmail());
        graduationDTO.setPhoneStudent(graduation.getStudent().getPhone());
        graduationDTO.setIdStudent(graduation.getStudent().getIdStudent());
        //school
        graduationDTO.setIdSchool(graduation.getSchool().getIdSchool());
        return graduationDTO;
    }
}
