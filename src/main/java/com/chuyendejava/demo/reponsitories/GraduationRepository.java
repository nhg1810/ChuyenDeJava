package com.chuyendejava.demo.reponsitories;

import com.chuyendejava.demo.entity.Graduation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraduationRepository extends JpaRepository<Graduation,Long> {

}
