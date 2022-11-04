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
@Table(name = "CONG_VIEC")
public class Job {
    @Id
    @Column(name ="MaCongViec")
    private String idJob;

    @Column(name ="TenCongViec")
    private String nameJob;

    @Column(name ="TenCongTy")
    private String nameCompany;

    @Column(name ="DiaChiCongTy")
    private String addressCompany;

    @Column(name ="ThoiGianLamViec")
    private Date timeJoinJob;

    @ManyToOne
    @JoinColumn(name = "MaNganhs")
    private Major major;

    @ManyToOne
    @JoinColumn(name = "SoCMND")
    private Student student;
}
