package com.chuyendejava.demo.controller;

import com.chuyendejava.demo.entity.Student;
import com.chuyendejava.demo.reponsitories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/search")
public class SearchController {
    private com.chuyendejava.demo.reponsitories.JobRepository JobRepository;
    private MajorRepository majorRepository;
    private StudentRepository studentRepository;
    private GraduationRepository graduationRepository;
    private SchoolRepository schoolRepository;

    @GetMapping("/search-student")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.addObject("title", "Tìm kiếm thông tin Sinh Viên");
        modelAndView.setViewName("search-student");
        modelAndView.addObject("student",studentRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/search-student-name/{entity}")
    public ModelAndView SearchStudent(@PathVariable String entity,
                                 ModelAndView modelAndView, BindingResult result){
        List<Student> student = studentRepository.findByNameContainingIgnoreCase(entity);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("search-student");
        return modelAndView;
    }
    @GetMapping("/search-student-id/{entity}")
    public ModelAndView SearchStudentId(@PathVariable Long entity,
                                      ModelAndView modelAndView, BindingResult result){
        Student student = studentRepository.getOne(entity);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("search-student");
        return modelAndView;
    }
    @GetMapping("/search-student-phone/{entity}")
    public ModelAndView SearchStudentPhone(@PathVariable String entity,
                                      ModelAndView modelAndView, BindingResult result){
        List<Student> student = studentRepository.findByPhoneContainingIgnoreCase(entity);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("search-student");
        return modelAndView;
    }
    @GetMapping("/search-student-address/{entity}")
    public ModelAndView SearchStudentAddress(@PathVariable String entity,
                                      ModelAndView modelAndView, BindingResult result){
        List<Student> student = studentRepository.findByAddressContainingIgnoreCase(entity);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("search-student");
        return modelAndView;
    }
    @GetMapping("/search-student-email/{entity}")
    public ModelAndView SearchStudentEmail(@PathVariable String entity,
                                      ModelAndView modelAndView, BindingResult result){
        List<Student> student = studentRepository.findByEmailContainingIgnoreCase(entity);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("search-student");
        return modelAndView;
    }
}
