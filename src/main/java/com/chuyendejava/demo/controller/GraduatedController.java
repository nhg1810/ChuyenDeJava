package com.chuyendejava.demo.controller;

import com.chuyendejava.demo.entity.Graduation;
import com.chuyendejava.demo.entity.Job;
import com.chuyendejava.demo.entity.Major;
import com.chuyendejava.demo.entity.Student;
import com.chuyendejava.demo.reponsitories.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/graduation")
public class GraduatedController {
    private com.chuyendejava.demo.reponsitories.JobRepository JobRepository;
    private MajorRepository majorRepository;
    private StudentRepository studentRepository;
    private GraduationRepository graduationRepository;
    private SchoolRepository schoolRepository;
    private JobRepository jobRepository;

    @GetMapping("/all")
    public ModelAndView index(ModelAndView modelAndView){
        List<Job> job = jobRepository.findAll();
        modelAndView.addObject("title", "Thống kê tốt nghiệp Sinh Viên");
        modelAndView.addObject("job",job);
        List<Graduation> graduations = graduationRepository.findAll();
        modelAndView.setViewName("graduation");
        modelAndView.addObject("graduation",graduations);
        return modelAndView;
    }
    @GetMapping("/search-job-name/{entity}")
    public ModelAndView SearchJobName(@PathVariable String entity,
                                      ModelAndView modelAndView, BindingResult result){
        List<Job> job = jobRepository.findByNameJobContainingIgnoreCase(entity);
        modelAndView.addObject("job",job);
        modelAndView.addObject("title", "Tìm kiêm tốt nghiệp Sinh Viên");
        List<Graduation> graduations = graduationRepository.findAll();
        modelAndView.addObject("graduation",graduations);
        modelAndView.setViewName("graduation");
        return modelAndView;
    }

    @GetMapping("/search-job-name-company/{entity}")
    public ModelAndView SearchJobNameCompany(@PathVariable String entity,
                                      ModelAndView modelAndView, BindingResult result){
        List<Job> job = jobRepository.findByNameCompanyContainingIgnoreCase(entity);
        modelAndView.addObject("job",job);
        modelAndView.addObject("title", "Tìm kiêm tốt nghiệp Sinh Viên");
        List<Graduation> graduations = graduationRepository.findAll();
        modelAndView.addObject("graduation",graduations);
        modelAndView.setViewName("graduation");
        return modelAndView;
    }
}
