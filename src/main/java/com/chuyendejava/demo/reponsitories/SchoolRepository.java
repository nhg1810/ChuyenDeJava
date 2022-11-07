package com.chuyendejava.demo.reponsitories;

import com.chuyendejava.demo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    School findByIdSchool(String idSchool);
}
