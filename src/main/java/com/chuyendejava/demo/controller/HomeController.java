package com.chuyendejava.demo.controller;

import com.chuyendejava.demo.entity.Job;
import com.chuyendejava.demo.entity.Major;
import com.chuyendejava.demo.entity.Student;
import com.chuyendejava.demo.reponsitories.JobRepository;
import com.chuyendejava.demo.reponsitories.MajorRepository;
import com.chuyendejava.demo.reponsitories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@AllArgsConstructor
@RequestMapping("/student")
public class HomeController {
    private JobRepository JobRepository;
    private MajorRepository majorRepository;
    private StudentRepository studentRepository;
    @GetMapping("")
    public ModelAndView index(){
        Student studentA = new Student(5311000,"Nguyen Hai Duong","nhduong@gmail.com",9898,"donghoi");
        Major majorA = new Major(1123,"nganh cong nghe thong tin","CNTT");
        majorRepository.save(majorA);
        studentRepository.save(studentA);
        Job job = new Job();
        job.setNameJob("Cong nghe phan mem");
        job.setIdJob("123");
        job.setStudent(studentA);
        job.setMajor(majorA);
        job.setAddressCompany("da nang");
        job.setNameCompany("FPT");
        Date date= new Date();
        job.setTimeJoinJob(date);
        JobRepository.save(job);
        return  new ModelAndView("student");
    }
}
