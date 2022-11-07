package com.chuyendejava.demo.reponsitories;

import com.chuyendejava.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCase(String name);
    List<Student> findByEmailContainingIgnoreCase(String email);
    List<Student> findByPhoneContainingIgnoreCase(String phone);
    List<Student> findByAddressContainingIgnoreCase(String address);


}
