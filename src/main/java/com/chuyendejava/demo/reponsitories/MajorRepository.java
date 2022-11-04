package com.chuyendejava.demo.reponsitories;

import com.chuyendejava.demo.entity.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository  extends JpaRepository<Major,Long> {
}
