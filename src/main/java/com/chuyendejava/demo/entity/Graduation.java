package com.chuyendejava.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "TOT_NGHIEP")
@EqualsAndHashCode(of = {"MaTotNghiep"})
public class Graduation {
    @Id
    @Column(name = "MaTotNghiep")
    private String idGraduation;

    @Column(name = "HeTN")
    private String greduationSystem;
    @Column(name = "NgayTN")
    private Date dateGreduation;
    @Column(name = "LoaiTN")
    private String greduationType;
    @ManyToOne
    @JoinColumn(name = "MaTruong")
    private School school;

    @ManyToOne
    @JoinColumn(name = "SoCMND")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "MaNganh")
    private Major major;
}
