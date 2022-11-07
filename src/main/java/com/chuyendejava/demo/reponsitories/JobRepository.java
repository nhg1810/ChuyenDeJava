package com.chuyendejava.demo.reponsitories;

import com.chuyendejava.demo.entity.Job;
import com.chuyendejava.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByNameJobContainingIgnoreCase(String nameJob);
    List<Job> findByNameCompanyContainingIgnoreCase(String nameCompany);
}
