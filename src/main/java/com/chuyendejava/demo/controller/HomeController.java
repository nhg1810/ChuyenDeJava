package com.chuyendejava.demo.controller;

import com.chuyendejava.demo.dto.GraduationDTO;
import com.chuyendejava.demo.entity.*;
import com.chuyendejava.demo.reponsitories.*;
import com.chuyendejava.demo.dto.mapper.graduationMapper;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/student")

public class HomeController {
    private JobRepository JobRepository;
    private MajorRepository majorRepository;
    private StudentRepository studentRepository;
    private GraduationRepository graduationRepository;
    private SchoolRepository schoolRepository;
    @GetMapping("")
    public ModelAndView index(ModelAndView modelAndView){
//        School schoolA = new School("VKU","Trường Đại Học Công Nghệ Thông Tin Việt-Hàn","Ngũ Hành Sơn",989987);
//        School schoolB = new School("UTE","Trường Đại Học Sư phạm Kĩ Thuật","Hải Châu",989987);
//        School schoolC = new School("UDE","Trường Đại Học Duy Tân","Hải Châu",989987);
//        schoolRepository.save(schoolA);
//        schoolRepository.save(schoolB);
//        schoolRepository.save(schoolC);

//        Major majorA = new Major(1123,"ngành công nghệ thông tin","CNTT");
//        Major majorB = new Major(1434,"ngành đồ hoạ máy tính ","CNTT");
//        Major majorC = new Major(1232,"ngành thiết kế mỹ thuật","kiến trúc");
//        majorRepository.save(majorA);
//        majorRepository.save(majorB);
//        majorRepository.save(majorC);
//
//        List<Major> majors = majorRepository.findAll();
        modelAndView.addObject("graduation",new GraduationDTO());
        modelAndView.addObject("p_major",majorRepository.findAll());
        modelAndView.addObject("p_school", schoolRepository.findAll());
        modelAndView.addObject("title", "Thêm thông tin Sinh Viên");

        modelAndView.setViewName("student");
        return  modelAndView;
    }
    @PostMapping("/new")
    public String addInfSv(@Valid @ModelAttribute("graduation") GraduationDTO graduationDTO, BindingResult result, RedirectAttributes attributes, Model model ){
        if (result.hasErrors()) {
            model.addAttribute("p_major",majorRepository.findAll());
            model.addAttribute("p_school", schoolRepository.findAll());
            model.addAttribute("msg_error", "lỗi điền thông tin !");
            model.addAttribute("msg_success", "");
            model.addAttribute("title", "Thêm thông tin Sinh Viên");
            return "student";
        }

        Graduation graduation = new Graduation();
        graduation.setSchool(schoolRepository.findByIdSchool(graduationDTO.getIdSchool()));
        graduation.setMajor(majorRepository.getOne(graduationDTO.getIdMajor()));
        graduation = graduationMapper.toEntity(graduationDTO, graduation);
        this.graduationRepository.save(graduation);
        model.addAttribute("msg_error", "");
        attributes.addFlashAttribute("msg_success", "Thêm thông tin Sinh Viên Thành Công!");
        return "redirect:/student";
    }
}
